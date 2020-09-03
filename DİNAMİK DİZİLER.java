package dynamicarrays;
import java.util.Arrays;
public class DynamicArrays {
private int array[];
private int size; //Dizinin mevcut boyutunu tutar 
private int capacity;//Dizinin toplam kapasitesini tutar 
//Dizi ve değerleri başlatmak için varsayılan yapıcı (Constructor)
public DynamicArrays(){
    array=new int[2];
    size=0;
    capacity=2;
}
public void ensureCapacity(int mincapacity)
{
    
    int temp[]=new int[capacity*mincapacity];
    for(int i=0;i<capacity;i++)
    {
        temp[i]=array[i];
    }
    array=temp;
    capacity=capacity*mincapacity;
}
//Sonuna eleman eklemek için 
public void addElement(int element)
{
    if(size==capacity)//Eğer tahsis edilen alanın tamamı kullanıldıysa
    {
     ensureCapacity(2);//Kapasiteni 2 katına çıkar
    }
    array[size]=element;
    size++;
}

//Bir indeksteki elemanı elde etmek için 

public int getElement(int index)
{
   return array[index]; 
}

//Bir indeksteki elementi silmek 
public void removeElement(int index)
{
  if(index>=size || index<0)
  {
      System.out.println("İlgili indexte herhangi bir eleman bulunmamaktadır");
  }
  else 
  {
      for(int i=index;i<size-1;i++)
      {
          array[i]=array[i+1];
     
      }
      array[size-1]=0;
      size--;
  }
}
public int size()
{
    return size;
}

public int Capacity()
{
    return capacity;
}

//Dizideki elemanları ekranda göstermek

public void PrintElements()
{
System.out.println("Dizinin Elemanları: "+Arrays.toString(array));
}


}

package dynamicarrays;
 
public class DynamicArrayTest {
    
    public static void main(String[] args)
    {
        DynamicArrays d_array=new DynamicArrays();
        
        //0. ve 1. indekslerine eleman ekleme 
         d_array.addElement(63);
         d_array.addElement(42);
         System.out.println("Size:"+d_array.size()+"and Capacity:"+
                 +d_array.Capacity());
         d_array.PrintElements();
         d_array.addElement(21);
         System.out.println("Size:"+d_array.size()+"and Capacity:"+
                 +d_array.Capacity());
         d_array.PrintElements();
           d_array.addElement(86);
         System.out.println("Size:"+d_array.size()+"and Capacity:"+
                 +d_array.Capacity());
         d_array.PrintElements();
         d_array.addElement(53);
         System.out.println("Size:"+d_array.size()+"and Capacity:"+
                 +d_array.Capacity());
         d_array.PrintElements();
         d_array.removeElement(2);
         System.out.println("Size:"+d_array.size()+"and Capacity:"+
                 +d_array.Capacity());
         d_array.PrintElements();
         
         d_array.removeElement(1);
         System.out.println("Size:"+d_array.size()+"and Capacity:"+
                 +d_array.Capacity());
         d_array.PrintElements();
           d_array.removeElement(2);
         System.out.println("Size:"+d_array.size()+"and Capacity:"+
                 +d_array.Capacity());
         d_array.PrintElements();
           d_array.addElement(75);
         System.out.println("Size:"+d_array.size()+"and Capacity:"+
                 +d_array.Capacity());
         d_array.PrintElements();
           d_array.removeElement(1);
         System.out.println("Size:"+d_array.size()+"and Capacity:"+
                 +d_array.Capacity());
         d_array.PrintElements();
   }
}
Size:2and Capacity:2
Dizinin Elemanları: [63, 42]
Size:3and Capacity:4
Dizinin Elemanları: [63, 42, 21, 0]
Size:4and Capacity:4
Dizinin Elemanları: [63, 42, 21, 86]
Size:5and Capacity:8
Dizinin Elemanları: [63, 42, 21, 86, 53, 0, 0, 0]
Size:4and Capacity:8
Dizinin Elemanları: [63, 42, 86, 53, 0, 0, 0, 0]
Size:3and Capacity:8
Dizinin Elemanları: [63, 86, 53, 0, 0, 0, 0, 0]
Size:2and Capacity:8
Dizinin Elemanları: [63, 86, 0, 0, 0, 0, 0, 0]
Size:3and Capacity:8
Dizinin Elemanları: [63, 86, 75, 0, 0, 0, 0, 0]
Size:2and Capacity:8
Dizinin Elemanları: [63, 75, 0, 0, 0, 0, 0, 0]
