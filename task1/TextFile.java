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

public class TextFile extends File {

    private String text;

    public TextFile(Directory directory, String name,String text){
        super(directory,name);
        this.text = text;
    }

    public boolean addText(String text){
        boolean result = false;
        if(exists()){
            TextFile file =  (TextFile) this.getDirectory().getFile(this.getName());
            String newText = file.getText().concat(text);
            file.setText(newText);
            result = true;
        }
        return result;
    }

    private void setText(String text){
        this.text = text;
    }

    public String getText() {
        return text;
    }

    @Override
    public boolean exists(){
        boolean result = false;
        if(this.getDirectory().getFile(this.getName()) != null){
            result = true;
        }
        return result;
    }

    @Override
    public boolean createNewFile() {
        boolean result = false;
        this.getDirectory().addFile(this);
        if(exists()){
            result = true;
        }
        return result;
    }

    @Override
    public boolean renameTo(String newName) {
        boolean result= false;
        if(exists()){
            File file = this.getDirectory().getFile(this.getName());
            file.setName(newName);
            result = true;
        }
        return result;
    }

    @Override
    public boolean delete() {
        boolean result = false;
        this.getDirectory().deleteFile(this);
        if(!exists()){
            result = true;
        }
        return result;
    }

    public void print(){
        System.out.println(text);
    }



}
