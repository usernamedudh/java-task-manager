package com.yourname.taskmanager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TaskManager taskManager = new TaskManager();

        // Вводим первую задачу
        System.out.print("Введите название первой задачи: ");
        String title1 = scanner.nextLine();
        System.out.print("Введите описание первой задачи: ");
        String description1 = scanner.nextLine();
        Task task1 = new Task(title1, description1);
        taskManager.addTask(task1);

        // Вводим вторую задачу
        System.out.print("Введите название второй задачи: ");
        String title2 = scanner.nextLine();
        System.out.print("Введите описание второй задачи: ");
        String description2 = scanner.nextLine();
        Task task2 = new Task(title2, description2);
        taskManager.addTask(task2);

        // Выводим все задачи, добавленные в список
        taskManager.printTaskList();
    }
}
