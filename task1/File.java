/*
 * 5.Simple Classes
 * Task 1
 *
 * Создать объект класса Текстовый файл, используя классы Файл,
 * Директория. Методы: создать, переименовать,
 * вывести на консоль содержимое, дополнить, удалить.
 *
 * Artsiom Barodka
 *
 */
package basics_of_OOP.Task1;

public abstract class File {

    private String name;
    private Directory directory;

    public File(Directory directory,String name){
        this.directory = directory;
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Directory getDirectory() {
        return directory;
    }

    public void setDirectory(Directory directory) {
        this.directory = directory;
    }

    public abstract boolean exists();

    public abstract boolean createNewFile();

    public abstract boolean renameTo(String newName);

    public abstract boolean delete();



}
