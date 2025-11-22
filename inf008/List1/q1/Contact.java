package q1;

public class Contact {

    private String name;
    private String phone;
    private String email;

    public Contact (String name, String phone){
        setName(name);
        setPhone(phone);
    }

    public Contact (String name, String phone, String email){
        setName(name);
        setPhone(phone);
        setEmail(email);
    }

    public String getName(){
        return this.name;
    }
    public String getEmail(){
        return this.email;
    }
    public String getPhone(){
        return this.phone;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setPhone(String phone){
        this.phone = phone;
    }

    public String displayInfo(){
        return "Name: " + getName() + "\nEmail: " + getEmail() + "\nPhone: " + getPhone();
    }

    public void updateContact (String phone, String email){
        setEmail(email);
        setPhone(phone);
    }
}


