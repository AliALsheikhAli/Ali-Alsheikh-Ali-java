package trees;
/*İkili Arama Ağacı Oluşturmayı ve 
  Dolaşmayı Sağlayan Java Programı
*/
public class Dugum {//Dugum
 
public int data;
public Dugum leftChild;
public Dugum rightChild;
public void displayNode()
{ 

System.out.print(" "+data+" "); 

}

}



package trees;

public class Agac { //Ağaç
    
private Dugum root;


public Agac() //Yapıcı Metot 
{ 
    root = null; 

}
public Dugum getRoot()
{
    return root; 
}

// Aağcın preOrder Dolaşılması
public void preOrder(Dugum localRoot)
{
if(localRoot!=null)
{
localRoot.displayNode();
preOrder(localRoot.leftChild);
preOrder(localRoot.rightChild);
}
}

// Ağacın postOrder Dolaşılması
public void postOrder(Dugum localRoot)
{
if(localRoot!=null)
{
postOrder(localRoot.leftChild);
postOrder(localRoot.rightChild);
localRoot.displayNode();
}
}

// Aağca bir düğüm eklemeyi salayan metot
public void insert(int newdata)
{
Dugum newNode = new Dugum();
newNode.data = newdata;
if(root==null)
root = newNode;
else
{
Dugum current = root;
Dugum parent;
while(true)
{
parent = current;
if(newdata<current.data)
{
current = current.leftChild;
if(current==null)
{
parent.leftChild=newNode;
return;
}
} else
{
current = current.rightChild;
if(current==null)
{
parent.rightChild=newNode;
return;
}
}
} // end while
} // end else not root
} // end insert()
} // class Tree

package trees;

public class TestAgac {
public static void main(String [] args)
   {
    Agac agac = new Agac();
// Aağca 10 tane sayı yerleştirilmesi
System.out.println("Sayılar : ");
for (int i=0;i<10;++i) {
int sayi = (int) (Math.random()*100);
System.out.print(sayi+" ");
agac.insert(sayi);
};
System.out.print("\nAğacın PreOrder Dolaşılması : ");
agac.preOrder(agac.getRoot());
System.out.print("\nAğacın PostOrder Dolaşılması : ");
agac.postOrder(agac.getRoot());
}
}
