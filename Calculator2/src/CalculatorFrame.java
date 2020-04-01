import java.awt.EventQueue;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class CalculatorFrame extends JFrame {
	
	boolean newequation;
	String alreadythere;

	private JPanel contentPane;

//	main = run frame 
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatorFrame frame = new CalculatorFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

//	create frame/buttons/values (GUI)
//	ugly i know, but its very quick to code GUI via window builder. 
	public CalculatorFrame() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 450, 278);
		contentPane.add(panel);
		panel.setLayout(null);
		
		
		JLabel btextlayout = new JLabel("");
		btextlayout.setBounds(239, 27, 205, 245);
		panel.add(btextlayout);
		btextlayout.setVerticalAlignment(SwingConstants.TOP);
		
		
//		Jbuttons 0-9 +=-*/
//		get textfield string ,concat string,  add new string on textfield 
//		"=" button takes string and turns into double and symbols into corresponding equation. 
//		result is then added in a new line 
		
		JButton B0 = new JButton("0");
		B0.setFont(new Font("Helvetica Neue", Font.PLAIN, 14));
		B0.setBounds(35, 129, 30, 29);
		panel.add(B0);
		B0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String alreadythere = btextlayout.getText();
				btextlayout.setText(alreadythere.concat("0")) ;
				
				  
			}
			
		});
		JButton B1 = new JButton("1");
		B1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String alreadythere = btextlayout.getText();
				btextlayout.setText(alreadythere.concat("1")) ;
			}
		});
		B1.setFont(new Font("Helvetica Neue", Font.PLAIN, 14));
		B1.setBounds(35, 167, 30, 29);
		panel.add(B1);
		B1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JButton B2 = new JButton("2");
		B2.setBounds(85, 167, 30, 29);
		panel.add(B2);
		B2.setFont(new Font("Helvetica Neue", Font.PLAIN, 14));
		B2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String alreadythere = btextlayout.getText();
				btextlayout.setText(alreadythere.concat("2")) ;
			}
		});
		
		JButton B3 = new JButton("3");
		B3.setFont(new Font("Helvetica Neue", Font.PLAIN, 14));
		B3.setBounds(134, 167, 30, 29);
		panel.add(B3);
		B3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String alreadythere = btextlayout.getText();
				btextlayout.setText(alreadythere.concat("3")) ;
			}
		});
		JButton B4 = new JButton("4");
		B4.setFont(new Font("Helvetica Neue", Font.PLAIN, 14));
		B4.setBounds(35, 205, 30, 29);
		panel.add(B4);
		B4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String alreadythere = btextlayout.getText();
				btextlayout.setText(alreadythere.concat("4")) ;
			}
		});
		
		JButton B5 = new JButton("5");
		B5.setBounds(85, 205, 30, 29);
		panel.add(B5);
		B5.setFont(new Font("Helvetica Neue", Font.PLAIN, 14));
		B5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String alreadythere = btextlayout.getText();
				btextlayout.setText(alreadythere.concat("5")) ;
			}
		});
		JButton B6 = new JButton("6");
		B6.setFont(new Font("Helvetica Neue", Font.PLAIN, 14));
		B6.setBounds(134, 205, 30, 29);
		panel.add(B6);
		B6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String alreadythere = btextlayout.getText();
				btextlayout.setText(alreadythere.concat("6")) ;
			}
		});
		
		JButton B7 = new JButton("7");
		B7.setFont(new Font("Helvetica Neue", Font.PLAIN, 14));
		B7.setBounds(35, 243, 30, 29);
		panel.add(B7);
		B7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String alreadythere = btextlayout.getText();
				btextlayout.setText(alreadythere.concat("7")) ;
			}
		});
		

		JButton B8 = new JButton("8");
		B8.setBounds(85, 243, 30, 29);
		panel.add(B8);
		B8.setFont(new Font("Helvetica Neue", Font.PLAIN, 14));
		B8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String alreadythere = btextlayout.getText();
				btextlayout.setText(alreadythere.concat("8")) ;
			}
		});
		
		JButton B9 = new JButton("9");
		B9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String alreadythere = btextlayout.getText();
				btextlayout.setText(alreadythere.concat("9")) ;
			}
		});
		B9.setFont(new Font("Helvetica Neue", Font.PLAIN, 14));
		B9.setBounds(134, 243, 30, 29);
		panel.add(B9);

		
		
		JButton bdot = new JButton(".");
		bdot.setBounds(85, 53, 30, 29);
		panel.add(bdot);
		bdot.setFont(new Font("Helvetica Neue", Font.PLAIN, 14));
		bdot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String alreadythere = btextlayout.getText();
				btextlayout.setText(alreadythere.concat(".")) ;
			}
		});
		
		JButton bce = new JButton("CE");
		bce.setFont(new Font("Helvetica Neue", Font.PLAIN, 14));
		bce.setBounds(134, 53, 30, 29);
		panel.add(bce);
		bce.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				btextlayout.setText("") ;
			}
		});
		
		JButton bequal = new JButton("=");
		bequal.setFont(new Font("Helvetica Neue", Font.PLAIN, 14));
		bequal.setBounds(134, 91, 30, 29);
		panel.add(bequal);
		bequal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double answer = computeAnother(btextlayout.getText());
				
//				 Alternative  format : print answer on new line ( this wont enable using answer for another equation )
//				String alreadythere = btextlayout.getText();
//				btextlayout.setText("<html>" + alreadythere.concat("<br/>"+  Double.toString(answer) + "</html>")) ;
				btextlayout.setText(Double.toString(answer)) ;
				
			}
		});
		
		
		JButton bdivide = new JButton("/");
		bdivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String alreadythere = btextlayout.getText();
				btextlayout.setText(alreadythere.concat("/")) ;
				
			}
		});
		
				
				
				JButton bminus = new JButton("-");
				bminus.setFont(new Font("Helvetica Neue", Font.PLAIN, 14));
				bminus.setBounds(35, 91, 30, 29);
				panel.add(bminus);
				bminus.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String alreadythere = btextlayout.getText();
						btextlayout.setText(alreadythere.concat("-")) ;
					}
				});
		
		JButton badd = new JButton("+");
		badd.setBounds(85, 91, 30, 29);
		panel.add(badd);
		badd.setFont(new Font("Helvetica Neue", Font.PLAIN, 14));
		badd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String alreadythere = btextlayout.getText();
				btextlayout.setText(alreadythere.concat("+")) ;
			}
		});
		
		JButton bmultiply = new JButton("*");
		bmultiply.setBounds(85, 129, 30, 29);
		panel.add(bmultiply);
		bmultiply.setFont(new Font("Helvetica Neue", Font.PLAIN, 14));
		bmultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String alreadythere = btextlayout.getText();
				btextlayout.setText(alreadythere.concat("*")) ;
			}
		});
		bdivide.setFont(new Font("Helvetica Neue", Font.PLAIN, 14));
		bdivide.setBounds(134, 129, 30, 29);
		panel.add(bdivide);
		
	}
	
//	code made by Maksim Dmitriev https://codereview.stackexchange.com/users/23821/maksim-dmitriev
	public double computeAnother(String equation) {
        double result = 0.0;
        String noMinus = equation.replace("-", "+-");
        String[] byPluses = noMinus.split("\\+");

        for (String multipl : byPluses) {
            String[] byMultipl = multipl.split("\\*");
            double multiplResult = 1.0;
            for (String operand : byMultipl) {
                if (operand.contains("/")) {
                    String[] division = operand.split("\\/");
                    double divident = Double.parseDouble(division[0]);
                    for (int i = 1; i < division.length; i++) {
                        divident /= Double.parseDouble(division[i]);
                    }
                    multiplResult *= divident;
                } else {
                    multiplResult *= Double.parseDouble(operand);
                }
            }
            result += multiplResult;
        }

        return result;
    }
	

}
	
	



