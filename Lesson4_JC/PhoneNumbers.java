package Lesson4_JC;

import java.util.*;

public class PhoneNumbers {
    public HashMap<String, Set<String>> phoneList;

    public PhoneNumbers() {
        this.phoneList = new HashMap<String, Set<String>>();
    }

    public void addPhone(String name, String number) {
            Set<String> phone = new HashSet<String>();

            if (this.phoneList.containsKey(name)) {
                phone = this.phoneList.get(name);
                phone.add(number);
                this.phoneList.put(name, phone);
            }
            else {
                phone.add(number);
                this.phoneList.put(name,phone);
            }
    }

    public String getByName (String name) {
        String result;
        if (this.phoneList.containsKey(name)) {
            result = name + this.phoneList.get(name);
        }
        else {
            result = "Такого пользователя нет";
        }
        return result;
    }
}
