package com.mycompany.javaassignment.Question15;
public class CalculatorOperation 
{
    double in=0;
    String v=null;
    public String displayDigit(String a,String b)
    {
        int i = 0;
        while (i < a.length() && a.charAt(i) == '0')
        {
            i++;
            StringBuffer sb = new StringBuffer(a);
            sb.replace(0, i, "");
            a=sb.toString();
        }
        return (a+b);
    }
    public void Opearation1(double c,String d)
    {
        in=c;
        v=d;
    }
    public Double Opearation2(double e)
    {
        if(v=="a")
        {
            return in+e;
        }
        else if(v=="s")
        {
            return in-e;
        }
        else if(v=="m")
        {
            return in*e;
        }
        else
        {
            return in/e;
        }
    }  
}
