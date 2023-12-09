package prtsc;
class eng{
    char gen ='m';
    void print(){
        System.out.println("i want my black pearl");
    }
}

class tam extends eng{
    char gen='f';
    void print(){
       System.out.println("black are pieces");      //super key word is used to print upper class
       super.print();
    }
}

class bio{
    public static void main(String[] args) {
        eng pr =new eng();
        System.out.println(pr.gen);
        tam rp =new tam();
        rp.print();
    }
}