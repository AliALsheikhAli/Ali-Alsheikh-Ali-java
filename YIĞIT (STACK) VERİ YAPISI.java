package charyığıt;

public class CharYığıt {
//Yığıt Sınıfa özgü değişkenler 
    private int maxsize;   
    private char[] yığıtdizi;
    private int top;
    
    //ilklendirme metodu: Main sınıfında nesne oluşturulduğu anda 
    //aşağıdaki değişkenler ilk değerlerini alırlar
    public CharYığıt (int max)
    {
        maxsize=max;
        yığıtdizi=new char[maxsize];
        top=-1;
    }
    
    public void push(char j)
    {
        yığıtdizi[++top]=j;
    }
  
    public char pop()
    {
        return yığıtdizi[top--];
    }
    public boolean isEmpty()
    {
        return top==-1;
    }
    
    
}




package charyığıt;

public class CharYığıtTest {
    
    public static void main(String []args)
    {
        CharYığıt y=new CharYığıt(25);
        String str="Canan BATUR ŞAHİN";
        for(int i=0;i<str.length();i++)
        {
            y.push(str.charAt(i)); //'C', 'A', 'N', 'A' ....
            
        }
        
        while(!y.isEmpty())
            System.out.println(y.pop()); 
     
    }
    
}
