/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author harrishayyanar
 */
public class Item{
    private int productid;
    private String productname;
    private int quantity;
    private String mfgdate;
    private float price;
    
public Item(int productid,String productname,int quantity,String mfgdate,float price ) {
     
        this.productid = productid;
        this.productname = productname;
        this.quantity = quantity;
        this.mfgdate = mfgdate;
        this.price = price;
    }
    
    public int getproductid()
    {
        return productid;
    }
    public String getproductname()
    {
        return productname;
    }
    public int getquantity()
    {
        return quantity;
    }
    public String getmfgdate()
    {
        return mfgdate;
    }
    public float price()
    {
        return price;
    }
}

