 
package kuyruk;

public class Kuyruk {

  private int boyut;
  private int[]kuyrukdizi;
  private int bas, son, elemansayısı;
  
  /*Yapıcı metot, Test sınıfında (main'in bulunduğu test dosyasında 
   İlklendirme işlemlerini yapar. Bunun anlamı, Kuyruk sınıfına dair
  bir nesne oluşturduğunuzda, nesne üzeridnen tanımlanan tüm değişkenlere
  ilk değerlerini atar.
  */
//Yapılandırıcı Metot
public Kuyruk(int s)
{
    boyut = s;   
    kuyrukdizi = new int[boyut];   
    bas = 0;    
    son = -1;   
    elemansayısı = 0; 
            
}

public void ekle(int j)//Kuyruğun sonuna ekleme Yapar
{
     if (son==boyut-1) son = -1;     
     kuyrukdizi[++son] = j;  
     elemansayısı++;
}
  
public int çıkar()
{
    int temp=kuyrukdizi[bas++];
    if(bas==boyut)
    {
        bas=0;
    }
    elemansayısı--;
    return temp;
            
}

public boolean bosmu()
{
    return elemansayısı==0;
}
  
}

package kuyruk;
public class KuyrukTest {
    
    
    public static void main(String [] args)
    {
     Kuyruk q=new Kuyruk(25);
     q.ekle(1);
     q.ekle(2);
     q.çıkar();
     q.çıkar();
     q.ekle(3);
     
     for (int i=4;i<10;i++)
     {
      q.ekle(i);
     }
     while(!q.bosmu())
     System.out.println(q.çıkar());
 
    }
    
}
