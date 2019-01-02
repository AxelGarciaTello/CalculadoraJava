package mooncalculadora3;
 import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;
 public class Calculadora extends JFrame implements ActionListener,
  KeyListener
{
  JLabel SegundoPlano, Operacion, Signo, Numero;
  JButton N0, N1, N2, N3, N4, N5, N6, N7, N8, N9, PuntoDecimal, Igual, Suma,
    Resta, Multiplicacion, Division, Potencia, Limpiar, Borrar, CambiarSigno;
  String numero, signo, operacion;
  float numero1, numero2, resultado;
  
    //Accion por defecto de los botones
  @Override  public void actionPerformed (ActionEvent e)
  {
    if (e.getSource () == N0)
      {
	numero = Numero.getText ();
	numero = numero + "0";
	Numero.setText (numero);
      }
    if (e.getSource () == N1)
      {
	numero = Numero.getText ();
	numero = numero + "1";
	Numero.setText (numero);
      }
    if (e.getSource () == N2)
      {
	numero = Numero.getText ();
	numero = numero + "2";
	Numero.setText (numero);
      }
    if (e.getSource () == N3)
      {
	numero = Numero.getText ();
	numero = numero + "3";
	Numero.setText (numero);
      }
    if (e.getSource () == N4)
      {
	numero = Numero.getText ();
	numero = numero + "4";
	Numero.setText (numero);
      }
    if (e.getSource () == N5)
      {
	numero = Numero.getText ();
	numero = numero + "5";
	Numero.setText (numero);
      }
    if (e.getSource () == N6)
      {
	numero = Numero.getText ();
	numero = numero + "6";
	Numero.setText (numero);
      }
    if (e.getSource () == N7)
      {
	numero = Numero.getText ();
	numero = numero + "7";
	Numero.setText (numero);
      }
    if (e.getSource () == N8)
      {
	numero = Numero.getText ();
	numero = numero + "8";
	Numero.setText (numero);
      }
    if (e.getSource () == N9)
      {
	numero = Numero.getText ();
	numero = numero + "9";
	Numero.setText (numero);
      }
    if (e.getSource () == PuntoDecimal)
      {
	numero = Numero.getText ();
	numero = numero + ".";
	Numero.setText (numero);
      }
    if (e.getSource () == CambiarSigno)
      {
	signo = Signo.getText ();
	if (signo.equals ("+"))
	  {
	    Signo.setText ("-");
	  }
	if (signo.equals ("-"))
	  {
	    Signo.setText ("+");
	  }
      }
    if (e.getSource () == Limpiar)
      {
	SegundoPlano.setText ("");
	Operacion.setText ("");
	Signo.setText ("+");
	Numero.setText ("");
	numero = "";
	signo = "";
	operacion = "";
	numero1 = 0;
	numero2 = 0;
	resultado = 0;
      }
    if (e.getSource () == Borrar)
      {
	numero = "";
	for (int i = 0; i < Numero.getText ().length () - 1; i++)
	  {
	    numero = numero + Numero.getText ().charAt (i);
	  } Numero.setText (numero);
      }
    if (e.getSource () == Igual)
      {
	numero = SegundoPlano.getText ();
	if (!numero.equals (""))
	  {
	    numero1 = Float.parseFloat (numero);
	    numero2 = Float.parseFloat (Numero.getText ());
	    operacion = Operacion.getText ();
	    signo = Signo.getText ();
	    if (signo.equals ("-"))
	      {
		numero2 *= -1;
	      }
	    switch (operacion)
	      {
	      case "+":
		resultado = numero1 + numero2;
		break;
	      case "-":
		resultado = numero1 - numero2;
		break;
	      case "*":
		resultado = numero1 * numero2;
		break;
	      case "/":
		resultado = numero1 / numero2;
		break;
	      case "^":
		resultado = numero1;
		for (int contador = 1; contador < numero2; contador++)
		  {
		    resultado *= numero1;
		  } break;
	      }
	    Numero.setText (String.valueOf (resultado));
	    SegundoPlano.setText ("");
	    Signo.setText ("+");
	    Operacion.setText ("");
	  }
      }
    if (e.getSource () == Suma)
      {
	numero = Numero.getText ();
	if (numero.equals (""))
	  {
	    Operacion.setText ("+");
	  }
	
	else
	  {
	    numero1 = Float.parseFloat (numero);
	    signo = Signo.getText ();
	    if (signo.equals ("-"))
	      {
		numero1 *= -1;
	      }
	    numero = SegundoPlano.getText ();
	    if (numero.equals (""))
	      {
		SegundoPlano.setText (String.valueOf (numero1));
		Operacion.setText ("+");
	      }
	    
	    else
	      {
		numero2 = Float.parseFloat (numero);
		operacion = Operacion.getText ();
		switch (operacion)
		  {
		  case "+":
		    resultado = numero1 + numero2;
		    break;
		  case "-":
		    resultado = numero1 - numero2;
		    break;
		  case "*":
		    resultado = numero1 * numero2;
		    break;
		  case "/":
		    resultado = numero1 / numero2;
		    break;
		  case "^":
		    resultado = numero1;
		    for (int contador = 1; contador < numero2; contador++)
		      {
			resultado *= numero1;
		      } break;
		  }
		SegundoPlano.setText (String.valueOf (resultado));
		Operacion.setText ("+");
	      }
	  }
	Signo.setText ("+");
	Numero.setText ("");
      }
    if (e.getSource () == Resta)
      {
	numero = Numero.getText ();
	if (numero.equals (""))
	  {
	    Operacion.setText ("-");
	  }
	
	else
	  {
	    numero1 = Float.parseFloat (numero);
	    signo = Signo.getText ();
	    if (signo.equals ("-"))
	      {
		numero1 *= -1;
	      }
	    numero = SegundoPlano.getText ();
	    if (numero.equals (""))
	      {
		SegundoPlano.setText (String.valueOf (numero1));
		Operacion.setText ("-");
	      }
	    
	    else
	      {
		numero2 = Float.parseFloat (numero);
		operacion = Operacion.getText ();
		switch (operacion)
		  {
		  case "+":
		    resultado = numero1 + numero2;
		    break;
		  case "-":
		    resultado = numero1 - numero2;
		    break;
		  case "*":
		    resultado = numero1 * numero2;
		    break;
		  case "/":
		    resultado = numero1 / numero2;
		    break;
		  case "^":
		    resultado = numero1;
		    for (int contador = 1; contador < numero2; contador++)
		      {
			resultado *= numero1;
		      } break;
		  }
		SegundoPlano.setText (String.valueOf (resultado));
		Operacion.setText ("-");
	      }
	  }
	Signo.setText ("+");
	Numero.setText ("");
      }
    if (e.getSource () == Multiplicacion)
      {
	numero = Numero.getText ();
	if (numero.equals (""))
	  {
	    Operacion.setText ("*");
	  }
	
	else
	  {
	    numero1 = Float.parseFloat (numero);
	    signo = Signo.getText ();
	    if (signo.equals ("-"))
	      {
		numero1 *= -1;
	      }
	    numero = SegundoPlano.getText ();
	    if (numero.equals (""))
	      {
		SegundoPlano.setText (String.valueOf (numero1));
		Operacion.setText ("*");
	      }
	    
	    else
	      {
		numero2 = Float.parseFloat (numero);
		operacion = Operacion.getText ();
		switch (operacion)
		  {
		  case "+":
		    resultado = numero1 + numero2;
		    break;
		  case "-":
		    resultado = numero1 - numero2;
		    break;
		  case "*":
		    resultado = numero1 * numero2;
		    break;
		  case "/":
		    resultado = numero1 / numero2;
		    break;
		  case "^":
		    resultado = numero1;
		    for (int contador = 1; contador < numero2; contador++)
		      {
			resultado *= numero1;
		      } break;
		  }
		SegundoPlano.setText (String.valueOf (resultado));
		Operacion.setText ("*");
	      }
	  }
	Signo.setText ("+");
	Numero.setText ("");
      }
    if (e.getSource () == Division)
      {
	numero = Numero.getText ();
	if (numero.equals (""))
	  {
	    Operacion.setText ("/");
	  }
	
	else
	  {
	    numero1 = Float.parseFloat (numero);
	    signo = Signo.getText ();
	    if (signo.equals ("-"))
	      {
		numero1 *= -1;
	      }
	    numero = SegundoPlano.getText ();
	    if (numero.equals (""))
	      {
		SegundoPlano.setText (String.valueOf (numero1));
		Operacion.setText ("/");
	      }
	    
	    else
	      {
		numero2 = Float.parseFloat (numero);
		operacion = Operacion.getText ();
		switch (operacion)
		  {
		  case "+":
		    resultado = numero1 + numero2;
		    break;
		  case "-":
		    resultado = numero1 - numero2;
		    break;
		  case "*":
		    resultado = numero1 * numero2;
		    break;
		  case "/":
		    resultado = numero1 / numero2;
		    break;
		  case "^":
		    resultado = numero1;
		    for (int contador = 1; contador < numero2; contador++)
		      {
			resultado *= numero1;
		      } break;
		  }
		SegundoPlano.setText (String.valueOf (resultado));
		Operacion.setText ("/");
	      }
	  }
	Signo.setText ("+");
	Numero.setText ("");
      }
    if (e.getSource () == Potencia)
      {
	numero = Numero.getText ();
	if (numero.equals (""))
	  {
	    Operacion.setText ("^");
	  }
	
	else
	  {
	    numero1 = Float.parseFloat (numero);
	    signo = Signo.getText ();
	    if (signo.equals ("-"))
	      {
		numero1 *= -1;
	      }
	    numero = SegundoPlano.getText ();
	    if (numero.equals (""))
	      {
		SegundoPlano.setText (String.valueOf (numero1));
		Operacion.setText ("^");
	      }
	    
	    else
	      {
		numero2 = Float.parseFloat (numero);
		operacion = Operacion.getText ();
		switch (operacion)
		  {
		  case "+":
		    resultado = numero1 + numero2;
		    break;
		  case "-":
		    resultado = numero1 - numero2;
		    break;
		  case "*":
		    resultado = numero1 * numero2;
		    break;
		  case "/":
		    resultado = numero1 / numero2;
		    break;
		  case "^":
		    resultado = numero1;
		    for (int contador = 1; contador < numero2; contador++)
		      {
			resultado *= numero1;
		      } break;
		  }
		SegundoPlano.setText (String.valueOf (resultado));
		Operacion.setText ("^");
	      }
	  }
	Signo.setText ("+");
	Numero.setText ("");
      }
  }
  
    //Acciones del teclado al momento de presionar una tecla
  @Override  public void keyPressed (KeyEvent e)
  {
    if (e.VK_0 == e.getKeyCode ())
      {
	numero = Numero.getText ();
	numero = numero + "0";
	Numero.setText (numero);
      }
    if (e.VK_1 == e.getKeyCode ())
      {
	numero = Numero.getText ();
	numero = numero + "1";
	Numero.setText (numero);
      }
    if (e.VK_2 == e.getKeyCode ())
      {
	numero = Numero.getText ();
	numero = numero + "2";
	Numero.setText (numero);
      }
    if (e.VK_3 == e.getKeyCode ())
      {
	numero = Numero.getText ();
	numero = numero + "3";
	Numero.setText (numero);
      }
    if (e.VK_4 == e.getKeyCode ())
      {
	numero = Numero.getText ();
	numero = numero + "4";
	Numero.setText (numero);
      }
    if (e.VK_5 == e.getKeyCode ())
      {
	numero = Numero.getText ();
	numero = numero + "5";
	Numero.setText (numero);
      }
    if (e.VK_6 == e.getKeyCode ())
      {
	numero = Numero.getText ();
	numero = numero + "6";
	Numero.setText (numero);
      }
    if (e.VK_7 == e.getKeyCode ())
      {
	numero = Numero.getText ();
	numero = numero + "7";
	Numero.setText (numero);
      }
    if (e.VK_8 == e.getKeyCode ())
      {
	numero = Numero.getText ();
	numero = numero + "8";
	Numero.setText (numero);
      }
    if (e.VK_9 == e.getKeyCode ())
      {
	numero = Numero.getText ();
	numero = numero + "9";
	Numero.setText (numero);
      }
    if (e.VK_PERIOD == e.getKeyCode ())
      {
	numero = Numero.getText ();
	numero = numero + ".";
	Numero.setText (numero);
      }
    if (e.VK_C == e.getKeyCode ())
      {
	SegundoPlano.setText ("");
	Operacion.setText ("");
	Signo.setText ("+");
	Numero.setText ("");
	numero = "";
	signo = "";
	operacion = "";
	numero1 = 0;
	numero2 = 0;
	resultado = 0;
      }
    if (e.VK_BACK_SPACE == e.getKeyCode ())
      {
	numero = "";
	for (int i = 0; i < Numero.getText ().length () - 1; i++)
	  {
	    numero = numero + Numero.getText ().charAt (i);
	  } Numero.setText (numero);
      }
    if (e.VK_I == e.getKeyCode ())
      {
	numero = SegundoPlano.getText ();
	if (!numero.equals (""))
	  {
	    numero1 = Float.parseFloat (numero);
	    numero2 = Float.parseFloat (Numero.getText ());
	    operacion = Operacion.getText ();
	    signo = Signo.getText ();
	    if (signo.equals ("-"))
	      {
		numero2 *= -1;
	      }
	    switch (operacion)
	      {
	      case "+":
		resultado = numero1 + numero2;
		break;
	      case "-":
		resultado = numero1 - numero2;
		break;
	      case "*":
		resultado = numero1 * numero2;
		break;
	      case "/":
		resultado = numero1 / numero2;
		break;
	      case "^":
		resultado = numero1;
		for (int contador = 1; contador < numero2; contador++)
		  {
		    resultado *= numero1;
		  } break;
	      }
	    Numero.setText (String.valueOf (resultado));
	    SegundoPlano.setText ("");
	    Signo.setText ("+");
	    Operacion.setText ("");
	  }
      }
    if (e.VK_PLUS == e.getKeyCode ())
      {
	numero = Numero.getText ();
	if (numero.equals (""))
	  {
	    Operacion.setText ("+");
	  }
	
	else
	  {
	    numero1 = Float.parseFloat (numero);
	    signo = Signo.getText ();
	    if (signo.equals ("-"))
	      {
		numero1 *= -1;
	      }
	    numero = SegundoPlano.getText ();
	    if (numero.equals (""))
	      {
		SegundoPlano.setText (String.valueOf (numero1));
		Operacion.setText ("+");
	      }
	    
	    else
	      {
		numero2 = Float.parseFloat (numero);
		operacion = Operacion.getText ();
		switch (operacion)
		  {
		  case "+":
		    resultado = numero1 + numero2;
		    break;
		  case "-":
		    resultado = numero1 - numero2;
		    break;
		  case "*":
		    resultado = numero1 * numero2;
		    break;
		  case "/":
		    resultado = numero1 / numero2;
		    break;
		  case "^":
		    resultado = numero1;
		    for (int contador = 1; contador < numero2; contador++)
		      {
			resultado *= numero1;
		      } break;
		  }
		SegundoPlano.setText (String.valueOf (resultado));
		Operacion.setText ("+");
	      }
	  }
	Signo.setText ("+");
	Numero.setText ("");
      }
    if (e.VK_MINUS == e.getKeyCode ())
      {
	numero = Numero.getText ();
	if (numero.equals (""))
	  {
	    Operacion.setText ("-");
	  }
	
	else
	  {
	    numero1 = Float.parseFloat (numero);
	    signo = Signo.getText ();
	    if (signo.equals ("-"))
	      {
		numero1 *= -1;
	      }
	    numero = SegundoPlano.getText ();
	    if (numero.equals (""))
	      {
		SegundoPlano.setText (String.valueOf (numero1));
		Operacion.setText ("-");
	      }
	    
	    else
	      {
		numero2 = Float.parseFloat (numero);
		operacion = Operacion.getText ();
		switch (operacion)
		  {
		  case "+":
		    resultado = numero1 + numero2;
		    break;
		  case "-":
		    resultado = numero1 - numero2;
		    break;
		  case "*":
		    resultado = numero1 * numero2;
		    break;
		  case "/":
		    resultado = numero1 / numero2;
		    break;
		  case "^":
		    resultado = numero1;
		    for (int contador = 1; contador < numero2; contador++)
		      {
			resultado *= numero1;
		      } break;
		  }
		SegundoPlano.setText (String.valueOf (resultado));
		Operacion.setText ("-");
	      }
	  }
	Signo.setText ("+");
	Numero.setText ("");
      }
    if (e.VK_M == e.getKeyCode ())
      {
	numero = Numero.getText ();
	if (numero.equals (""))
	  {
	    Operacion.setText ("*");
	  }
	
	else
	  {
	    numero1 = Float.parseFloat (numero);
	    signo = Signo.getText ();
	    if (signo.equals ("-"))
	      {
		numero1 *= -1;
	      }
	    numero = SegundoPlano.getText ();
	    if (numero.equals (""))
	      {
		SegundoPlano.setText (String.valueOf (numero1));
		Operacion.setText ("*");
	      }
	    
	    else
	      {
		numero2 = Float.parseFloat (numero);
		operacion = Operacion.getText ();
		switch (operacion)
		  {
		  case "+":
		    resultado = numero1 + numero2;
		    break;
		  case "-":
		    resultado = numero1 - numero2;
		    break;
		  case "*":
		    resultado = numero1 * numero2;
		    break;
		  case "/":
		    resultado = numero1 / numero2;
		    break;
		  case "^":
		    resultado = numero1;
		    for (int contador = 1; contador < numero2; contador++)
		      {
			resultado *= numero1;
		      } break;
		  }
		SegundoPlano.setText (String.valueOf (resultado));
		Operacion.setText ("*");
	      }
	  }
	Signo.setText ("+");
	Numero.setText ("");
      }
    if (e.VK_D == e.getKeyCode ())
      {
	numero = Numero.getText ();
	if (numero.equals (""))
	  {
	    Operacion.setText ("/");
	  }
	
	else
	  {
	    numero1 = Float.parseFloat (numero);
	    signo = Signo.getText ();
	    if (signo.equals ("-"))
	      {
		numero1 *= -1;
	      }
	    numero = SegundoPlano.getText ();
	    if (numero.equals (""))
	      {
		SegundoPlano.setText (String.valueOf (numero1));
		Operacion.setText ("/");
	      }
	    
	    else
	      {
		numero2 = Float.parseFloat (numero);
		operacion = Operacion.getText ();
		switch (operacion)
		  {
		  case "+":
		    resultado = numero1 + numero2;
		    break;
		  case "-":
		    resultado = numero1 - numero2;
		    break;
		  case "*":
		    resultado = numero1 * numero2;
		    break;
		  case "/":
		    resultado = numero1 / numero2;
		    break;
		  case "^":
		    resultado = numero1;
		    for (int contador = 1; contador < numero2; contador++)
		      {
			resultado *= numero1;
		      } break;
		  }
		SegundoPlano.setText (String.valueOf (resultado));
		Operacion.setText ("/");
	      }
	  }
	Signo.setText ("+");
	Numero.setText ("");
      }
    if (e.VK_P == e.getKeyCode ())
      {
	numero = Numero.getText ();
	if (numero.equals (""))
	  {
	    Operacion.setText ("^");
	  }
	
	else
	  {
	    numero1 = Float.parseFloat (numero);
	    signo = Signo.getText ();
	    if (signo.equals ("-"))
	      {
		numero1 *= -1;
	      }
	    numero = SegundoPlano.getText ();
	    if (numero.equals (""))
	      {
		SegundoPlano.setText (String.valueOf (numero1));
		Operacion.setText ("^");
	      }
	    
	    else
	      {
		numero2 = Float.parseFloat (numero);
		operacion = Operacion.getText ();
		switch (operacion)
		  {
		  case "+":
		    resultado = numero1 + numero2;
		    break;
		  case "-":
		    resultado = numero1 - numero2;
		    break;
		  case "*":
		    resultado = numero1 * numero2;
		    break;
		  case "/":
		    resultado = numero1 / numero2;
		    break;
		  case "^":
		    resultado = numero1;
		    for (int contador = 1; contador < numero2; contador++)
		      {
			resultado *= numero1;
		      } break;
		  }
		SegundoPlano.setText (String.valueOf (resultado));
		Operacion.setText ("^");
	      }
	  }
	Signo.setText ("+");
	Numero.setText ("");
      }
  }
  private void InterfazGrafica ()
  {
    SegundoPlano = new JLabel ();	//Inicializa el objeto
    SegundoPlano.setText ("");	//Texto al objeto
    SegundoPlano.setLocation (5, 5);	//Punto de localizacion
    SegundoPlano.setSize (225, 30);	//Tamaño
    //Tipo de letra y tamaño
    SegundoPlano.setFont (new java.awt.Font ("Tahoma", 0, 24));
    this.add (SegundoPlano);	//Agregarlo a la pantalla
    Operacion = new JLabel ();
    Operacion.setText ("");
    Operacion.setLocation (235, 5);
    Operacion.setSize (30, 30);
    Operacion.setFont (new java.awt.Font ("Tahome", 0, 24));
    this.add (Operacion);
    Signo = new JLabel ();
    Signo.setText ("+");
    Signo.setLocation (5, 40);
    Signo.setSize (30, 30);
    Signo.setFont (new java.awt.Font ("Tahome", 0, 24));
    this.add (Signo);
    Numero = new JLabel ();
    Numero.setText ("");
    Numero.setLocation (40, 40);
    Numero.setSize (225, 30);
    Numero.setFont (new java.awt.Font ("Tahome", 0, 24));
    this.add (Numero);
    N7 = new JButton ();
    N7.setText ("7");
    N7.setLocation (5, 75);
    N7.setSize (45, 23);
    N7.addActionListener (this);	//Accion al boton
    N7.addKeyListener (this);	//Accion del boton por el teclado
    this.add (N7);
    N8 = new JButton ();
    N8.setText ("8");
    N8.setLocation (55, 75);
    N8.setSize (45, 23);
    N8.addActionListener (this);
    N8.addKeyListener (this);
    this.add (N8);
    N9 = new JButton ();
    N9.setText ("9");
    N9.setLocation (105, 75);
    N9.setSize (45, 23);
    N9.addActionListener (this);
    N9.addKeyListener (this);
    this.add (N9);
    CambiarSigno = new JButton ();
    CambiarSigno.setText ("±");
    CambiarSigno.setLocation (155, 75);
    CambiarSigno.setSize (45, 23);
    CambiarSigno.addActionListener (this);
    CambiarSigno.addKeyListener (this);
    this.add (CambiarSigno);
    Borrar = new JButton ();
    Borrar.setText ("<-");
    Borrar.setLocation (205, 75);
    Borrar.setSize (45, 23);
    Borrar.addActionListener (this);
    Borrar.addKeyListener (this);
    this.add (Borrar);
    N4 = new JButton ();
    N4.setText ("4");
    N4.setLocation (5, 103);
    N4.setSize (45, 23);
    N4.addActionListener (this);
    this.add (N4);
    N5 = new JButton ();
    N5.setText ("5");
    N5.setLocation (55, 103);
    N5.setSize (45, 23);
    N5.addActionListener (this);
    N5.addKeyListener (this);
    this.add (N5);
    N6 = new JButton ();
    N6.setText ("6");
    N6.setLocation (105, 103);
    N6.setSize (45, 23);
    N6.addActionListener (this);
    N6.addKeyListener (this);
    this.add (N6);
    Potencia = new JButton ();
    Potencia.setText ("^");
    Potencia.setLocation (155, 103);
    Potencia.setSize (45, 23);
    Potencia.addActionListener (this);
    Potencia.addKeyListener (this);
    this.add (Potencia);
    Limpiar = new JButton ();
    Limpiar.setText ("C");
    Limpiar.setLocation (205, 103);
    Limpiar.setSize (45, 23);
    Limpiar.addActionListener (this);
    Limpiar.addKeyListener (this);
    this.add (Limpiar);
    N1 = new JButton ();
    N1.setText ("1");
    N1.setLocation (5, 131);
    N1.setSize (45, 23);
    N1.addActionListener (this);
    N1.addKeyListener (this);
    this.add (N1);
    N2 = new JButton ();
    N2.setText ("2");
    N2.setLocation (55, 131);
    N2.setSize (45, 23);
    N2.addActionListener (this);
    N2.addKeyListener (this);
    this.add (N2);
    N3 = new JButton ();
    N3.setText ("3");
    N3.setLocation (105, 131);
    N3.setSize (45, 23);
    N3.addActionListener (this);
    N3.addKeyListener (this);
    this.add (N3);
    Multiplicacion = new JButton ();
    Multiplicacion.setText ("*");
    Multiplicacion.setLocation (155, 131);
    Multiplicacion.setSize (45, 23);
    Multiplicacion.addActionListener (this);
    Multiplicacion.addKeyListener (this);
    this.add (Multiplicacion);
    Division = new JButton ();
    Division.setText ("/");
    Division.setLocation (205, 131);
    Division.setSize (45, 23);
    Division.addActionListener (this);
    Division.addKeyListener (this);
    this.add (Division);
    N0 = new JButton ();
    N0.setText ("0");
    N0.setLocation (5, 159);
    N0.setSize (45, 23);
    N0.addActionListener (this);
    N0.addKeyListener (this);
    this.add (N0);
    PuntoDecimal = new JButton ();
    PuntoDecimal.setText (".");
    PuntoDecimal.setLocation (55, 159);
    PuntoDecimal.setSize (45, 23);
    PuntoDecimal.addActionListener (this);
    PuntoDecimal.addKeyListener (this);
    this.add (PuntoDecimal);
    Igual = new JButton ();
    Igual.setText ("=");
    Igual.setLocation (105, 159);
    Igual.setSize (45, 23);
    Igual.addActionListener (this);
    Igual.addKeyListener (this);
    this.add (Igual);
    Suma = new JButton ();
    Suma.setText ("+");
    Suma.setLocation (155, 159);
    Suma.setSize (45, 23);
    Suma.addActionListener (this);
    Suma.addKeyListener (this);
    this.add (Suma);
    Resta = new JButton ();
    Resta.setText ("-");
    Resta.setLocation (205, 159);
    Resta.setSize (45, 23);
    Resta.addActionListener (this);
    Resta.addKeyListener (this);
    this.add (Resta);
  } public Calculadora ()
  {
    this.setLayout (null);
    this.setResizable (false);	//No modificar el tamaño
    this.setTitle ("Calculadora");	//Titulo
    this.setSize (270, 215);	//Tamaño
    this.setLocationRelativeTo (null);	//Localizacion en el centro
    setDefaultCloseOperation (JFrame.DISPOSE_ON_CLOSE);
    this.setIconImage (new ImageIcon (getClass ().getResource ("Calculadora.png")).getImage () );	//Logotipo de la ventana
    this.InterfazGrafica ();
  } public static void main (String[]args)
  {
    Calculadora calculadora = new Calculadora ();
  }  @Override  public void keyTyped (KeyEvent e)
  {
    throw new UnsupportedOperationException ("Not supported yet.");	//To change body of generated methods, choose Tools | Templates.
  }  @Override  public void keyReleased (KeyEvent e)
  {
    throw new UnsupportedOperationException ("Not supported yet.");	//To change body of generated methods, choose Tools | Templates.
} } 
