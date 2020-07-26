/*
	Calculator
*/
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Frame1 extends Frame
{
	Button [] digits=new Button[9];
	Label l1=new Label("0",Label.RIGHT);
	Button mc=new Button("MC");
	Button mr=new Button("MR");
	Button ms=new Button("MS");
	Button m_plus=new Button("M+");
	Button m_minus=new Button("M-");
	Button back=new Button("<--");
	Button ce=new Button("CE");
	Button c=new Button("C");
	Button plus_minus=new Button("\u00B1");
	Button root=new Button("\u221A");
	Button divide=new Button("/");
	Button percent=new Button("%");
	Button multiply=new Button("*");
	Button _1divx=new Button("1/x");
	Button minus=new Button("-");
	Button plus=new Button("+");
	Button zero=new Button("0");
	Button point=new Button(".");
	Button equal=new Button("=");

	Frame1()
	{
		setLayout(null);
		setResizable(false);
		setTitle("Calculator");
		addWindowListener(new WindowAdapter(){public void windowClosing(WindowEvent e){System.exit(0);}});
		Dimension d=new Dimension(390,450);
		setSize(d);
		Point p=new Point(200,200);
		setLocation(p);
		setBackground(new Color(18,36,36));
		l1.setBounds(40,80,325,65);add(l1);
		l1.setBackground(new Color(255,252,252));
		l1.setFont(new Font("Arial",1,30));
		//mc.setBounds(120,160,45,40);mc.setFont(new Font("Serif",0,15));add(mc);
		//mr.setBounds(170,160,45,40);mr.setFont(new Font("Serif",0,15));add(mr);
		//ms.setBounds(220,160,45,40);ms.setFont(new Font("Serif",0,15));add(ms);
		//m_plus.setBounds(270,160,45,40);m_plus.setFont(new Font("Serif",0,15));add(m_plus);
		//m_minus.setBounds(320,160,45,40);m_minus.setFont(new Font("Serif",0,15));add(m_minus);
		back.setBounds(120-50,205,45,40);back.setFont(new Font("Serif",0,15));add(back);
		ce.setBounds(170-50,205,45,40);ce.setFont(new Font("Serif",0,15));add(ce);
		c.setBounds(220-50,205,45,40);c.setFont(new Font("Serif",0,15));add(c);
		plus_minus.setBounds(270-50,205,45,40);plus_minus.setFont(new Font("Serif",0,20));add(plus_minus);
		root.setBounds(320-50,205,45,40);root.setFont(new Font("Serif",0,18));add(root);
		divide.setBounds(270-50,250,45,40);divide.setFont(new Font("Serif",0,20));add(divide);
		percent.setBounds(320-50,250,45,40);percent.setFont(new Font("Serif",0,17));add(percent);
		multiply.setBounds(270-50,295,45,40);multiply.setFont(new Font("Serif",0,20));add(multiply);
		_1divx.setBounds(320-50,295,45,40);_1divx.setFont(new Font("Serif",0,15));add(_1divx);
		minus.setBackground(new Color(225,255,204));minus.setFont(new Font("Serif",0,20));add(minus);
		equal.setBackground(new Color(239,249,244));equal.setFont(new Font("Serif",0,20));add(equal);
		zero.setBounds(320-50,340,45,85);
		zero.setBounds(120-50,385,95,40);zero.setFont(new Font("Serif",0,20));add(zero);
		point.setBounds(220-50,385,45,40);point.setFont(new Font("Serif",0,20));add(point);
		equal.setBounds(320-50,340,45,85);equal.setFont(new Font("Serif",0,20));add(equal);
		plus.setBounds(270-50,385,45,40);plus.setFont(new Font("Serif",0,20));add(plus);
		minus.setBounds(270-50,340,45,40);minus.setFont(new Font("Serif",0,20));add(minus);
		digits[0]=new Button();
		for(int i=0;i<9;i++)
		{
			digits[i]=new Button(""+(i+1));
			digits[i].setSize(45,40);
			digits[i].setBackground(new Color(239,249,244));
			add(digits[i]);
			digits[i].addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){digit_Click(e);}});
			digits[i].setFont(new Font("Serif",0,15));
		}
		digits[6].setBounds(120-50,250,45,40);
		digits[7].setBounds(170-50,250,45,40);
		digits[8].setBounds(220-50,250,45,40);
		digits[3].setBounds(120-50,295,45,40);
		digits[4].setBounds(170-50,295,45,40);
		digits[5].setBounds(220-50,295,45,40);
		digits[0].setBounds(120-50,340,45,40);
		digits[1].setBounds(170-50,340,45,40);
		digits[2].setBounds(220-50,340,45,40);

		for(int i=0;i<9;i++)
		{
			digits[i].setBackground(new Color(239,249,244));

		}
		divide.setBackground(new Color(225,255,204));
		percent.setBackground(new Color(225,255,204));
		multiply.setBackground(new Color(225,255,204));
		_1divx.setBackground(new Color(225,255,204));
		minus.setBackground(new Color(225,255,204));
		equal.setBackground(new Color(225,255,204));
		plus.setBackground(new Color(225,255,204));
		point.setBackground(new Color(225,255,204));
		zero.setBackground(new Color(225,255,204));

		divide.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){digit_Click(e);}});
		multiply.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){digit_Click(e);}});
		plus.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){digit_Click(e);}});
		minus.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){digit_Click(e);}});
		zero.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){digit_Click(e);}});
		equal.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){equal_Click(e);}});
		back.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){back_Click(e);}});
		percent.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){digit_Click(e);}});
		ce.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){ce_click(e);}});
		c.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){c_click(e);}});
		point.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){point_click(e);}});
		_1divx.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){_1divx_click(e);}});
		root.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){root_click(e);}});

	}

	void digit_Click(ActionEvent ee)
	{
		if(l1.getText()=="0" || l1.getText()=="Math Error!")
			l1.setText("");
		String s1=l1.getText();
		String s2=ee.getActionCommand();
		l1.setText(s1+s2);
		back.setEnabled(true);
	}
	void equal_Click(ActionEvent ee)
	{

		String s=l1.getText();
		int p=s.indexOf("+");
		try{

			if(p>0)
			{
				String s1=s.substring(0,p);
				String s2=s.substring(p+1);
				Double n1=Double.parseDouble(s1);
				Double n2=Double.parseDouble(s2);
				l1.setText((n1+n2)+"");
			}
			else if((p=s.indexOf("-"))>0)
			{
				String s1=s.substring(0,p);
				String s2=s.substring(p+1);
				double n1=Double.parseDouble(s1);
				double n2=Double.parseDouble(s2);
				l1.setText((n1-n2)+"");
			}
			else if((p=s.indexOf("*"))>0)
			{
				String s1=s.substring(0,p);
				String s2=s.substring(p+1);
				double n1=Double.parseDouble(s1);
				double n2=Double.parseDouble(s2);
				l1.setText((n1*n2)+"");
			}
			else if((p=s.indexOf("/"))>0)
			{
				String s1=s.substring(0,p);
				String s2=s.substring(p+1);
				double n1=Double.parseDouble(s1);
				double n2=Double.parseDouble(s2);
				String ans=(n1/n2)+"";
				l1.setText(ans);
			}
			else if((p=s.indexOf("%"))>0)
			{
				String s1=s.substring(0,p);
				double d=Double.parseDouble(s1);
				d=d/100;
				l1.setText(d+"");
			}else
				l1.setText("Invalid Input!");

		}catch(Exception ec)
		{
			l1.setText("Math Error!");
		}
	}
	void back_Click(ActionEvent ee)
	{

		String s1=l1.getText();
		int l=s1.length();
		s1=s1.substring(0,l-1);
		l1.setText(s1);
		l=s1.length();
		if(l==0)
			back.setEnabled(false);
	}

	void ce_click(ActionEvent ee)
	{
		l1.setText("0");
	}
	void c_click(ActionEvent ee)
	{
		l1.setText("0");
	}
	void point_click(ActionEvent ee)
	{
		l1.setText(l1.getText()+".");
	}
	void _1divx_click(ActionEvent ee)
	{
		try{
			double result = 1.0/Double.parseDouble(l1.getText());
			String finalResult = result+"";
			l1.setText(finalResult);
		}catch(Exception e){
			l1.setText("Math Error!");
		}
	}
	void root_click(ActionEvent ee)
	{
		try{
			double result = Math.sqrt(Double.parseDouble(l1.getText()));
			String finalResult = result+"";
			l1.setText(finalResult);
		}catch(Exception e){
			l1.setText("Math Error!");
		}
	}
}
class Calculator
{
	public static void main( String [] args)
	{
		new Frame1().setVisible(true);
	}

}



