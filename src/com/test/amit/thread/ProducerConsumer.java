package com.test.amit.thread;

import java.util.Arrays;

public class ProducerConsumer {
	private static int[] buffer = new int[5];
	private static int count;
	// private static Object lock = new Object();

	static class Producer {
		void produce() {
			// synchronized (lock) {
			try {
				if (!isFull(buffer)) {
					buffer[count++] = 1;
				}
				// }
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Producer" + e.getMessage());
			}
		}
	}

	static class Consumer {
		void consume() {
			try {
				// synchronized (lock) {
				if (!isEmpty()) {
					buffer[--count] = 0;
				}
				// }
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Consumer" + e.getMessage());
			}
		}
	}

	static boolean isEmpty() {
		return count == 0;
	}

	static boolean isFull(int[] buffer) {
		return count == buffer.length;
	}

	public static void main(String[] args) throws InterruptedException {

		Producer producer = new Producer();
		Consumer consumer = new Consumer();

		Runnable produceTask = () -> {
			for (int i = 0; i < 50; i++) {
				producer.produce();
			}
			System.out.println("Done Producing");
		};
		Runnable consumeTask = () -> {
			for (int i = 0; i < 50; i++) {
				consumer.consume();
			}
			System.out.println("Done Consuming");
		};

		Thread producerThread = new Thread(produceTask);
		Thread consumerThread = new Thread(consumeTask);

		producerThread.start();
		consumerThread.start();

		producerThread.join();
		consumerThread.join();

		System.out.println(Arrays.toString(buffer));

	}
}
