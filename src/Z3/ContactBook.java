package Z3;

import java.util.ArrayList;
class ContactBook<T extends Contact>{
    ArrayList<T> contacts = new ArrayList<>();

    public void addContact(T contact){
        contacts.add(contact);
    }

    public void printList(){
        for(T con : contacts){
            System.out.println("Имя: "+con.getName());
            con.print();
        }
    }

    public void congratulate(String name){
        for (T contact : contacts) {
            if (contact.getName().equals(name)) {
                System.out.println("Поздравим с Новым годом ваш контакт из записной книжки: " + name);
                contact.sendMessage();
                return;
            }
        }
        System.out.println("Не найден контакт с указанным именем.");
    }
}