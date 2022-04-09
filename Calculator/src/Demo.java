import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;

public class Demo {

	//ArrayList<JButton> buttons = new ArrayList<JButton>();
	//num1 holds the equated number
	//num2 is the enacting number
	//text shows current state viewed on calculator
	static String num1="",num2="",text;
	static char operator;
	//hold conditions in calculator
	static boolean num1HasValue=false,num2HasValue=false,hasBeenEquated=false,hasOperator=false;
	//displays current state on calculator
	static JLabel textview = new JLabel();
	//displays chosen operator
	static JLabel operatorLabel = new JLabel();
	//displays first number
	static JLabel lastNumberLabel = new JLabel();
	private static boolean negativeClicked=false;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame frame = new JFrame();
		JLayeredPane pane = new JLayeredPane();
		
		//frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(2000,850);
		//frame.setLayout();
		frame.add(pane);
		frame.setVisible(true);
		
		textview.setBounds(100,10,500,20);
		textview.setVisible(true);
		textview.setFont(new Font("Arial", Font.PLAIN, 20));
		textview.setText("Perfect");
		
		operatorLabel.setBounds(70,0,500,20);
		operatorLabel.setVisible(true);
		operatorLabel.setFont(new Font("Arial", Font.PLAIN, 20));
		operatorLabel.setText("_");
		
		lastNumberLabel.setBounds(0,0,500,20);
		lastNumberLabel.setVisible(true);
		lastNumberLabel.setFont(new Font("Arial", Font.PLAIN, 20));
		lastNumberLabel.setText("#");
		
		//The one button
		JButton oneButton = new JButton();
		oneButton.setBounds(50,50,50,50);
		oneButton.setText("1");
		oneButton.setVisible(true);
		oneButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==oneButton) {
					if(hasBeenEquated&&!hasOperator) {
						reset();
					}
					if(!num1HasValue) {
						num1+="1";
						updateTextview(num1);
					}
					else {
						num2+="1";
						num2HasValue=true;
						updateTextview(num2);
					}
				}
			}
		});
		
		//The two button
		JButton twoButton = new JButton();
		twoButton.setBounds(125,50,50,50);
		twoButton.setText("2");
		twoButton.setVisible(true);
		twoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==twoButton) {
					if(hasBeenEquated&&!hasOperator) {
						reset();
					}
					if(!num1HasValue) {
						num1+="2";
						updateTextview(num1);
					}
					else {
						num2+="2";
						num2HasValue=true;
						updateTextview(num2);
					}
				}
			}
		});
		
		//The three button
		JButton threeButton = new JButton();
		threeButton.setBounds(200,50,50,50);
		threeButton.setText("3");
		threeButton.setVisible(true);
		threeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==threeButton) {
					if(hasBeenEquated&&!hasOperator) {
						reset();
					}
					if(!num1HasValue) {
						num1+="3";
						updateTextview(num1);
					}
					else {
						num2+="3";
						num2HasValue=true;
						updateTextview(num2);
					}
				}
			}
		});
		
		//The four button
		JButton fourButton = new JButton();
		fourButton.setBounds(50,125,50,50);
		fourButton.setText("4");
		fourButton.setVisible(true);
		fourButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==fourButton) {
					if(hasBeenEquated&&!hasOperator) {
						reset();
					}
					if(!num1HasValue) {
						num1+="4";
						updateTextview(num1);
					}
					else {
						num2+="4";
						num2HasValue=true;
						updateTextview(num2);
					}
				}
			}
		});
		//The five button
		JButton fiveButton = new JButton();
		fiveButton.setBounds(125,125,50,50);
		fiveButton.setText("5");
		fiveButton.setVisible(true);
		fiveButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==fiveButton) {
					if(hasBeenEquated&&!hasOperator) {
						reset();
					}
					if(!num1HasValue) {
						num1+="5";
						updateTextview(num1);
					}
					else {
						num2+="5";
						num2HasValue=true;
						updateTextview(num2);
					}
				}
			}
		});
		//The six button
		JButton sixButton = new JButton();
		sixButton.setBounds(200,125,50,50);
		sixButton.setText("6");
		sixButton.setVisible(true);
		sixButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==sixButton) {
					if(hasBeenEquated&&!hasOperator) {
						reset();
					}
					if(!num1HasValue) {
						num1+="6";
						updateTextview(num1);
					}
					else {
						num2+="6";
						num2HasValue=true;
						updateTextview(num2);
					}
				}
			}
		});
		//The seven button
		JButton sevenButton = new JButton();
		sevenButton.setBounds(50,200,50,50);
		sevenButton.setText("7");
		sevenButton.setVisible(true);
		sevenButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==sevenButton) {
					if(hasBeenEquated&&!hasOperator) {
						reset();
					}
					if(!num1HasValue) {
						num1+="7";
						updateTextview(num1);
					}
					else {
						num2+="7";
						num2HasValue=true;
						updateTextview(num2);
					}
				}
			}
		});
		//The eight button
		JButton eightButton = new JButton();
		eightButton.setBounds(125,200,50,50);
		eightButton.setText("8");
		eightButton.setVisible(true);
		eightButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==eightButton) {
					if(hasBeenEquated&&!hasOperator) {
						reset();
					}
					if(!num1HasValue) {
						num1+="8";
						updateTextview(num1);
					}
					else {
						num2+="8";
						num2HasValue=true;
						updateTextview(num2);
					}
				}
			}
		});
		//The nine button
		JButton nineButton = new JButton();
		nineButton.setBounds(200,200,50,50);
		nineButton.setText("9");
		nineButton.setVisible(true);
		nineButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==nineButton) {
					if(hasBeenEquated&&!hasOperator) {
						reset();
					}
					if(!num1HasValue) {
						num1+="9";
						updateTextview(num1);
					}
					else {
						num2+="9";
						num2HasValue=true;
						updateTextview(num2);
					}
				}
			}
		});
		//The zero button
		JButton zeroButton = new JButton();
		zeroButton.setBounds(125,275,50,50);
		zeroButton.setText("0");
		zeroButton.setVisible(true);
		zeroButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==zeroButton) {
					if(hasBeenEquated&&!hasOperator) {
						reset();
					}
					if(!num1HasValue) {
						num1+="0";
						updateTextview(num1);
					}
					else {
						num2+="0";
						num2HasValue=true;
						updateTextview(num2);
					}
				}
			}
		});
		
		//The decimal button
		JButton decimalButton = new JButton();
		decimalButton.setBounds(50,275,50,50);
		decimalButton.setText(".");
		decimalButton.setVisible(true);
		decimalButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==decimalButton) {
					/*
					if(hasBeenEquated&&!hasOperator) {
						reset();
					}
					*/
					
					if(!num1HasValue) {
						num1+=".";
						updateTextview(num1);
					}
					else {
						num2+=".";
						num2HasValue=true;
						updateTextview(num2);
					}
				}
			}
		});
		
		
		
		//The plus button
		JButton plusButton = new JButton();
		plusButton.setBounds(275,50,50,50);
		plusButton.setText("+");
		plusButton.setVisible(true);
		plusButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==plusButton) {
					hasOperator=true;
					if(!hasBeenEquated) {
						num1HasValue=true;
						updateTextview("");
						if(num2HasValue&&!hasBeenEquated) {
							evaluate();
							num2="";
							updateTextview(num1);
						}
						lastNumberLabel.setText(num1);
						operator='+';
						operatorLabel.setText("+");
					}
					else {
						num1HasValue=true;
						updateTextview("");
						lastNumberLabel.setText(num1);
						operator='+';
						operatorLabel.setText("+");
					}
					
				}
			}
		});
		//The minus button
		JButton minusButton = new JButton();
		minusButton.setBounds(275,125,50,50);
		minusButton.setText("-");
		minusButton.setVisible(true);
		minusButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==minusButton) {
						hasOperator=true;
						if(!hasBeenEquated) {
							num1HasValue=true;
							updateTextview("");
							if(num2HasValue&&!hasBeenEquated) {
								evaluate();
								num2="";
								updateTextview(num1);
							}
							operator='-';
							operatorLabel.setText("-");
							lastNumberLabel.setText(num1);
						}
						else {
							num1HasValue=true;
							updateTextview("");
							lastNumberLabel.setText(num1);
							operator='-';
							operatorLabel.setText("-");
						}
					}
			}
		});
		//The multiply button
		JButton multiplyButton = new JButton();
		multiplyButton.setBounds(275,200,50,50);
		multiplyButton.setText("*");
		multiplyButton.setVisible(true);
		multiplyButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==multiplyButton) {
					hasOperator=true;
					if(!hasBeenEquated) {
						num1HasValue=true;
						updateTextview("");
						if(num2HasValue&&!hasBeenEquated) {
							evaluate();
							num2="";
							updateTextview(num1);
						}
						
						operator='*';
						operatorLabel.setText("*");
						lastNumberLabel.setText(num1);
					}
					else {
						num1HasValue=true;
						updateTextview("");
						lastNumberLabel.setText(num1);
						operator='*';
						operatorLabel.setText("*");
					}
				}
			}
		});
		//The divide button
		JButton divideButton = new JButton();
		divideButton.setBounds(275,275,50,50);
		divideButton.setText("/");
		divideButton.setVisible(true);
		divideButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==divideButton) {
					hasOperator=true;
					if(!hasBeenEquated) {
						num1HasValue=true;
						updateTextview("");
						if(num2HasValue&&!hasBeenEquated) {
							evaluate();
							num2="";
							updateTextview(num1);
						}
						operator='/';
						operatorLabel.setText("/");
						lastNumberLabel.setText(num1);
					}
					else {
						num1HasValue=true;
						updateTextview("");
						lastNumberLabel.setText(num1);
						operator='/';
						operatorLabel.setText("/");
					}
				}
			}
		});
		
		//The power button
		JButton powerButton = new JButton();
		powerButton.setBounds(350,200,50,50);
		powerButton.setText("^");
		powerButton.setVisible(true);
		powerButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==powerButton) {
					
					hasOperator=true;
					if(!hasBeenEquated) {
						num1HasValue=true;
						updateTextview("");
						if(num2HasValue&&!hasBeenEquated) {
							evaluate();
							num2="";
							updateTextview(num1);
						}
						operator='^';
						operatorLabel.setText("^");
						lastNumberLabel.setText(num1);
					}
					else {
						num1HasValue=true;
						updateTextview("");
						lastNumberLabel.setText(num1);
						operator='^';
						operatorLabel.setText("^");
					}
				}
			}
		});
		
		//The root button
		JButton rootButton = new JButton();
		rootButton.setBounds(350,275,50,50);
		rootButton.setText("~");
		rootButton.setVisible(true);
		rootButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==rootButton) {
					
					hasOperator=true;
					if(!hasBeenEquated) {
						num1HasValue=true;
						updateTextview("");
						if(num2HasValue&&!hasBeenEquated) {
							evaluate();
							num2="";
							updateTextview(num1);
						}
						operator='~';
						operatorLabel.setText("~");
						lastNumberLabel.setText(num1);
					}
					else {
						num1HasValue=true;
						updateTextview("");
						lastNumberLabel.setText(num1);
						operator='~';
						operatorLabel.setText("~");
					}
				}
			}
		});
		
		
		
		//The clear button
		JButton clearButton = new JButton();
		clearButton.setBounds(350,50,50,50);
		clearButton.setText("C");
		clearButton.setVisible(true);
		clearButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==clearButton) {
					reset();
					updateTextview("");
				}
			}
		});
		
		//The negate button
		JButton negateButton = new JButton();
		negateButton.setBounds(350,125,50,50);
		negateButton.setText("(-)");
		negateButton.setVisible(true);
		negateButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==negateButton) {
					
					if(!num1HasValue) {
						if(!negativeClicked) {
							num1="-"+num1;
							updateTextview(num1);
							negativeClicked=true;
						}
						
					}
					else {
						if(!negativeClicked) {
							num2="-"+num2;
							updateTextview(num2);
							negativeClicked=true;
						}
						
					}
				}
			}
		});
		
		//The equals button
		JButton equalsButton = new JButton();
		equalsButton.setBounds(200,275,50,50);
		equalsButton.setText("=");
		equalsButton.setVisible(true);
		equalsButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==equalsButton) {
					evaluate();
					updateTextview(num1);
					num2HasValue=false;
					num2="";
					operatorLabel.setText("");
					lastNumberLabel.setText("");
					hasBeenEquated=true;
					/*
					if(!num1HasValue) {
						num1HasValue=true;
					}
					if(num2HasValue) {
						evaluate();
						num2="";
						updateTextview(num1);
					}
					*/
					
					
				}
			}
		});
		
		
		pane.add(textview, Integer.valueOf(1));
		pane.add(operatorLabel, Integer.valueOf(1));
		pane.add(lastNumberLabel, Integer.valueOf(1));
		
		pane.add(oneButton, Integer.valueOf(1));
		pane.add(twoButton, Integer.valueOf(1));
		pane.add(threeButton, Integer.valueOf(1));
		pane.add(fourButton, Integer.valueOf(1));
		pane.add(fiveButton, Integer.valueOf(1));
		pane.add(sixButton, Integer.valueOf(1));
		pane.add(sevenButton, Integer.valueOf(1));
		pane.add(eightButton, Integer.valueOf(1));
		pane.add(nineButton, Integer.valueOf(1));
		pane.add(zeroButton, Integer.valueOf(1));
		pane.add(plusButton, Integer.valueOf(1));
		pane.add(minusButton, Integer.valueOf(1));
		pane.add(multiplyButton, Integer.valueOf(1));
		pane.add(divideButton, Integer.valueOf(1));
		pane.add(clearButton, Integer.valueOf(1));
		pane.add(equalsButton, Integer.valueOf(1));
		pane.add(decimalButton, Integer.valueOf(1));
		pane.add(negateButton, Integer.valueOf(1));
		pane.add(powerButton, Integer.valueOf(1));
		pane.add(rootButton, Integer.valueOf(1));
		
		
		
	}
	
	public static void updateTextview(String str) {
		textview.setText(str);
	}
	public static void evaluate() {
		double num1AsDouble=Double.parseDouble(num1);
		double num2AsDouble=Double.parseDouble(num2);
		switch(operator){
		case '+':
			num1=""+(num1AsDouble+num2AsDouble);
			break;
		
		case '-':
			num1=""+(num1AsDouble-num2AsDouble);
			break;
			
		case '*':
			num1=""+(num1AsDouble*num2AsDouble);
			break;
		case '/':
			num1=""+(num1AsDouble/num2AsDouble);
			break;
		case '^':
			num1=""+(Math.pow(num1AsDouble, num2AsDouble));
			break;
		case '~':
			num1=""+(Math.pow(num1AsDouble, (1/num2AsDouble)));
			break;
		
		}
	}
	public static void reset() {
		hasBeenEquated=false;
		num1="";
		num2="";
		num1HasValue=false;
		num2HasValue=false;
		operatorLabel.setText("");
		lastNumberLabel.setText("");
	}

}
