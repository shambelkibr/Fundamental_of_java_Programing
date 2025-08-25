class student{
    private String name;

    public String getname(){
        return name;
    }

    public void  setname(String name){
        this.name=name;

    }

}

class test{

    public static void main(String[] args) {
       student stu1=new student();
       stu1.setname("melona");
       System.out.println(stu1.getname()); 
       
    }
}
