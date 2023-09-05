package hwSem3.task2;
/*Задача 2: Файловый менеджер (ООП, исключения)

Создайте класс FileManager. Этот класс должен иметь методы для выполнения основных операций с файлами:
чтение, запись и копирование. Каждый из этих методов должен выбрасывать соответствующее исключение,
если в процессе выполнения операции произошла ошибка (например, FileNotFoundException, если файл не найден).*/

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws Exception {
       // FileManager fm = new FileManager();
        File source = new File("hwSem3/task2/test.txt");
        File dest = new File("hwSem3/task2/destFile.txt");
        try {
            FileManager.read("hwSem3/task2/test.txt");
        } catch (ReaderException e) {
            System.out.println("Read failed.." + e.getMessage());
        }

        try {
            FileManager.write("hwSem3/task2/test.txt");

        }catch (WriteException e){
            System.out.println("Write failed.." + e.getMessage());
        }

        try{
            FileManager.copyFile(source,dest);


        }catch (CopyException e){
            System.out.println("Copy failed....." + e.getMessage());
        }


    }
}
