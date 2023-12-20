package ec.edu.ups.practica.cuatro.prototipo.biblioteca;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class SistemaBiblioteca extends JFrame {
	
	public SistemaBiblioteca() {
		//Titulo de la ventana
		setTitle("Sistema de Biblioteca");
		//Dimensiones de la ventana
		setSize(1080,720);
		//Para cerrar directo desde ventana
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//PANELES
		Panel panelUno = new Panel();
		Panel panelUnoD = new Panel();
		Panel panelDos = new Panel();
		Panel panelTres = new Panel(); 
		Panel panelizquierdo = new Panel(new GridLayout(3,1));
		Panel panelDerecho = new Panel(new GridLayout(9,1));
		//Creacion de panel Uno, encabezado de la pagina. 
		JLabel titulo = new JLabel("Sistema de Biblioteca");
        Font fuenteTitulo = new Font("Arial", Font.BOLD, 30); // Puedes ajustar el tamaño aquí
        titulo.setFont(fuenteTitulo);
        
		JTextField buscar = new JTextField("Escriba...",20);
		JButton buscardos = new JButton("Buscar");
		panelUnoD.add(titulo, BorderLayout.WEST);
		panelUnoD.add(buscar);
		panelUnoD.add(buscardos);
		//Creacion y uso del panel dos sobrE la empresa. 
		//importamos la imagen 
		ImageIcon imagen = new ImageIcon("C:/Users/dell/Downloads/biblioteca.jpg");
		Image image = imagen.getImage().getScaledInstance(300, 200, Image.SCALE_SMOOTH);
        imagen = new ImageIcon(image);
        JLabel labelImagen = new JLabel(imagen);
        //añadimos en el panel izquierdo la imagen. 
		panelizquierdo.add(labelImagen);
		JLabel proposito = new JLabel("NUESTRO PROPOSITO!");
		Font fuenteProposito = new Font("Arial", Font.PLAIN,28 );
		proposito.setFont(fuenteProposito);
	    Font fuenteSaludo = new Font("Arial", Font.ITALIC, 22);
		JTextArea saludo  = new JTextArea("En Sbooks estamos comprometidos\ncon la divulgacion de obras literarias"
				+ "\ncon el objetivos de influir en el criterio\n de las nuevas generaciones.");
			   
		saludo.setFont(fuenteSaludo);
		panelizquierdo.add(proposito);
		panelizquierdo.add(saludo);
		//CREACION Y USO DEL PANEL DERECHO
		JLabel opciones = new JLabel("Bienvenid@s ");
		//Usamos font para mejorar la tipografia de los encabezados
		Font fuenteOpciones = new Font("Arial", Font.PLAIN, 20);
		opciones.setFont(fuenteOpciones);
		//Agregamos espacio para separar con el GridLayout
		JLabel espacio1 = new JLabel("    ");
		JLabel espacio2 = new JLabel("    ");
		JLabel espacio3 = new JLabel("    ");
		JLabel espacio4 = new JLabel("    ");
		//Agregamos el boton biblioteca
		Button biblioteca = new Button("1. Biblioteca");
		//Realizamos para dar clic y abrir la otra vetana 
		biblioteca.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				biblioteca();	
			}
		});
		//Agregamos el boton libro
		Button libro = new Button("2. Libro");
		//Para dar clic e ingresar a libro
		libro.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				libro();
			}
		});
		//Agregamos el boton usuario
		Button usuario = new Button("3. Usuario");
		usuario.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				usuario();
			}
		});
		//agregamos el boton prestamo
		Button prestamo = new Button("4. Prestamo");
		prestamo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				prestamo();
			}
		});
		//Agregamos los botones y los espacios en el panel derecho 
		panelDerecho.add(opciones);
		panelDerecho.add(espacio1);
		panelDerecho.add(biblioteca);
		panelDerecho.add(espacio2);
		panelDerecho.add(libro);
		panelDerecho.add(espacio3);
		panelDerecho.add(usuario);
		panelDerecho.add(espacio4);
		panelDerecho.add(prestamo);
		
		//Agregamos los paneles a otros paneles 
		panelUno.add(panelUnoD);
		panelDos.add(panelizquierdo);
		panelTres.add(panelDerecho);
		// agregamos los paneles y orientamos hacia que eje cardinar van estar
		//orientados
		add(panelUno, BorderLayout.NORTH);
		add(panelDos, BorderLayout.WEST);
		add(panelTres, BorderLayout.CENTER);
	
		
       	
	}
	public void biblioteca() {
		//Creamos la clase biblioteca que va a tener el frame 
		JFrame biblioteca = new JFrame();
		//Creamos panele norte y centro y con gridlayout para colocar
		// en forma de tabla a los datos del panel
		Panel panelNorte = new Panel(new GridLayout(3,1));
		Panel panelCentro = new Panel(new GridLayout(2,2));
		JLabel bienvenida = new JLabel("Bienvenido a Biblioteca", JLabel.CENTER);
		Font fuenteBienvenida = new Font("Arial", Font.BOLD, 20);

		bienvenida.setFont(fuenteBienvenida);
		JLabel bOpciones = new JLabel("Selecionar las opción necesaria: ", JLabel.CENTER);
		//creamos botones crear, buscar y actualizar 
		Button crear = new Button("1. Crear");
		crear.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				crearBiblioteca();
			}
		});
		Button buscar  = new Button("2. Buscar");
		buscar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				buscarBiblioteca();
			}
		});
		Button actualizar = new Button("3. Actualizar");
		actualizar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				actualizarBiblioteca();
			}
		});
		Button eliminar = new Button("4. Eliminar");
		eliminar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				eliminarBiblioteca();
			}
		});
		//Agregamos ambos label en el panel norte
		panelNorte.add(bienvenida);
		panelNorte.add(bOpciones);
		//Agregamos los botones 
		panelCentro.add(crear);
		panelCentro.add(buscar);
		panelCentro.add(actualizar);
		panelCentro.add(eliminar);
		//agregamos a la biblioteca y orientamos 
		biblioteca.add(panelNorte, BorderLayout.NORTH);
		biblioteca.add(panelCentro, BorderLayout.CENTER);
		//Agregamos el titulo a la ventana
		biblioteca.setTitle("Biblioteca");
		//Agregamos las dimensiones
		biblioteca.setSize(500,300);
		//Agregamos la en que parte se ve abrir la ventana
		biblioteca.setLocation(50,50);
		//Mostramos la ventana
		biblioteca.setVisible(true);
	}
	//CREAMOS 4 metods de biblioteca con sus rspectivos
	//JFrames y en base al CRUD del mismo
	public void crearBiblioteca() {
		JFrame crearDos = new JFrame();
		Panel panelN = new Panel();
		Panel panelD = new Panel();
		Panel panel3 = new Panel();
		JLabel ingresar = new JLabel("Ingreso de Datos Biblioteca");
		JLabel ingrsarNombre = new JLabel("Nombre ");
		JTextField ingresarN = new JTextField(10);
		JLabel ingresarDireccion = new JLabel("Direccion ");
		JTextField ingresarD = new JTextField(10);
		JButton crear = new JButton("Crear");
		panelN.add(ingresar);
		panelD.add(ingrsarNombre);
		panelD.add(ingresarN);
		panelD.add(ingresarDireccion);
		panelD.add(ingresarD);
		panel3.add(crear);
		crearDos.add(panelN, BorderLayout.NORTH);
		crearDos.add(panelD);
		crearDos.add(panel3, BorderLayout.SOUTH);
		crearDos.setTitle("Crear");
		crearDos.setSize(200,200);
		crearDos.setVisible(true);
	}
	public void actualizarBiblioteca() {
		JFrame buscarDos = new JFrame();
		Panel panel1 = new Panel();
		Panel panel11 = new Panel();
		Panel panel3= new Panel();
		JLabel ingresar1 = new JLabel("Actualizar  Datos Biblioteca");
		JLabel ingresarNom = new JLabel("Nombre ");
		JTextField ingresarNomb = new JTextField(10);
		JLabel ingresarDi = new JLabel("Direccion a Actualizar ");
		JTextField ingresarDir = new JTextField(10);
		JButton actualizar = new JButton("Actualizar");
		panel1.add(ingresar1);
		panel11.add(ingresarNom);
		panel11.add(ingresarNomb);
		panel11.add(ingresarDi);
		panel11.add(ingresarDir);
		panel3.add(actualizar);
		buscarDos.add(panel1, BorderLayout.NORTH);
		buscarDos.add(panel11);
		buscarDos.add(panel3, BorderLayout.SOUTH);
		buscarDos.setTitle("Actualizar");
		buscarDos.setSize(200,200);
		buscarDos.setLocation(50,50);
		buscarDos.setVisible(true);
		
	}
	public void buscarBiblioteca() {
		JFrame buscarDos = new JFrame();
		Panel panel1 = new Panel();
		Panel panel11 = new Panel();
		Panel panelBuscar= new Panel();
		JLabel ingresar1 = new JLabel("Buscar Datos Biblioteca");
		JLabel ingresarNom = new JLabel("Ingrese el nombre ");
		
		JTextField ingresarNomb = new JTextField(10);
		JButton buscar = new JButton("Buscar");
		
		
		panel1.add(ingresar1);
		panel11.add(ingresarNom);
		panel11.add(ingresarNomb);
		panelBuscar.add(buscar);
		buscarDos.add(panel1, BorderLayout.NORTH);
		buscarDos.add(panel11);
		buscarDos.add(panelBuscar, BorderLayout.SOUTH);
		buscarDos.setTitle("Buscar");
		buscarDos.setSize(250,250);
		buscarDos.setLocation(50,50);
		buscarDos.setVisible(true);
	}
	
	public void eliminarBiblioteca() {
		JFrame buscarDos = new JFrame();
		Panel panel1 = new Panel();
		Panel panel11 = new Panel();
		Panel panelEliminar = new Panel();
		JLabel ingresar1 = new JLabel("Eliminar Datos Biblioteca");
		JLabel ingresarNom = new JLabel("Ingrese el nombre ");
		
		JTextField ingresarNomb = new JTextField(10);
		JButton eliminar = new JButton("Eliminar");
		
		
		panel1.add(ingresar1);
		panel11.add(ingresarNom);
		panel11.add(ingresarNomb);
		panelEliminar.add(eliminar);
		buscarDos.add(panel1, BorderLayout.NORTH);
		buscarDos.add(panel11);
		buscarDos.add(panelEliminar, BorderLayout.SOUTH);
		buscarDos.setTitle("Eliminar");
		buscarDos.setSize(250,250);
		buscarDos.setLocation(50,50);
		buscarDos.setVisible(true);
	}
	
	public void libro() {
		//Agregamos el JFrame de lbro
	JFrame libro = new JFrame();
	Panel panelNorte = new Panel(new GridLayout(3,1));
	Panel panelCentro = new Panel(new GridLayout(2,2));
	JLabel bienvenida = new JLabel("Bienvenidos a Libro" , JLabel.CENTER);
	Font fuenteBienvenida = new Font("Arial", Font.BOLD, 20);

	bienvenida.setFont(fuenteBienvenida);
	JLabel bOpciones = new JLabel("Seleccionar la opcion necesaria ", JLabel.CENTER);
	//Creamos los botones y haacemos que sean cliqueables
	Button crear = new Button("1. Crear Libro");
	crear.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			crearLibro();
		}
	});
	Button buscar  = new Button("2. Buscar Libro");
	buscar.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			buscarLibro();
		}
	});
	Button actualizar = new Button("3. Actualizar Libro ");
	actualizar.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			actualizarLibro();
		}
	});
	Button eliminar = new Button("4. Eliminar Libro");
	eliminar.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			eliminarLibro();
		}
	});
	
	panelNorte.add(bienvenida);
	panelNorte.add(bOpciones);
	
	panelCentro.add(crear);
	panelCentro.add(buscar);
	panelCentro.add(actualizar);
	panelCentro.add(eliminar);

	libro.add(panelNorte, BorderLayout.NORTH);
	libro.add(panelCentro, BorderLayout.CENTER);

	libro.setTitle("Libro");
	libro.setSize(500,300);
	libro.setLocation(50,50);
	libro.setVisible(true);
	}
	//CREAMOS 4 METODOS CON SUS RESPECTIVOS
	//JFrames que contiene el CRUD de Libro
	public void crearLibro() {
		
	JFrame crearDos = new JFrame();
	Panel panelN = new Panel();
	Panel panelD = new Panel();
	Panel panel3 = new Panel();
	JLabel ingresar = new JLabel("Ingreso de Datos Libro");
	JLabel ingrsarNombre = new JLabel("Nombre ");
	JTextField ingresarN = new JTextField(10);
	JLabel ingresarDireccion = new JLabel("Direccion ");
	JTextField ingresarD = new JTextField(10);
	JLabel ingresarAutor= new JLabel("Autor ");
	JTextField ingresarA = new JTextField(10);
	JButton crear = new JButton("Crear");
	panelN.add(ingresar);
	panelD.add(ingrsarNombre);
	panelD.add(ingresarN);
	panelD.add(ingresarDireccion);
	panelD.add(ingresarD);
	panelD.add(ingresarAutor);
	panelD.add(ingresarA);
	panel3.add(crear);
	crearDos.add(panelN, BorderLayout.NORTH);
	crearDos.add(panelD);
	crearDos.add(panel3, BorderLayout.SOUTH);
	crearDos.setTitle("Crear");
	crearDos.setSize(200, 250);
	crearDos.setLocation(50,50);
	crearDos.setVisible(true);
	}
	public void buscarLibro() {
		///Crear un 
	JFrame buscarDos = new JFrame();
	Panel panel1 = new Panel(new GridLayout(2,1));
	Panel panel11 = new Panel(new GridLayout(2,1));
	Panel panel12 = new Panel(new GridLayout(4,1));
	Panel panel3 = new Panel();
	JLabel ingresar1 = new JLabel("Buscar Datos libro", JLabel.CENTER);
	Font datosLibro = new Font("Arial", Font.BOLD,15);
	ingresar1.setFont(datosLibro);
	JLabel opcionesb = new JLabel("Escoga una opción", JLabel.CENTER);
	JLabel ingresarNom = new JLabel("1. Titulo ", JLabel.CENTER);
	JTextField ingresarNomb = new JTextField(10);
	JLabel ingresarDi = new JLabel("2. Autor", JLabel.CENTER);
	JTextField ingresarDir = new JTextField(10);
	JLabel ingresarAño = new JLabel(" Año", JLabel.CENTER);
	JTextField ingresarAñ = new JTextField(10);
	JButton buscar = new JButton("Buscar");
	panel1.add(ingresar1);
	panel1.add(opcionesb);
	panel11.add(ingresarNom);
	panel11.add(ingresarNomb);
	panel12.add(ingresarDi);
	panel12.add(ingresarDir);
	panel12.add(ingresarAño);
	panel12.add(ingresarAñ);
	panel3.add(buscar);

	buscarDos.add(panel1, BorderLayout.NORTH);
	buscarDos.add(panel11, BorderLayout.WEST);
	buscarDos.add(panel12, BorderLayout.EAST);
	buscarDos.add(panel3, BorderLayout.SOUTH);
	buscarDos.setTitle("Buscar");
	buscarDos.setSize(300, 300);
	buscarDos.setLocation(50,50);
	buscarDos.setVisible(true);
	}
	public void actualizarLibro() {
		JFrame actualizarDos = new JFrame();
		Panel panel1 = new Panel();
		Panel panel11 = new Panel();
		Panel panel3= new Panel();
		JLabel ingresar1 = new JLabel("Actualizar  Datos Libro");
		JLabel ingresarNom = new JLabel("Titulo ");
		JTextField ingresarNomb = new JTextField(10);
		JLabel ingresarDi = new JLabel("Autor a Actualizar ");
		JTextField ingresarDir = new JTextField(10);
		JLabel ingresarAño = new JLabel("Año a Actualizar ");
		JTextField ingresarAñ = new JTextField(10);
		JButton actualizar = new JButton("Actualizar");
		panel1.add(ingresar1);
		panel11.add(ingresarNom);
		panel11.add(ingresarNomb);
		panel11.add(ingresarDi);
		panel11.add(ingresarDir);
		panel11.add(ingresarAño);
		panel11.add(ingresarAñ);
		panel3.add(actualizar);
		actualizarDos.add(panel1, BorderLayout.NORTH);
		actualizarDos.add(panel11);
		actualizarDos.add(panel3, BorderLayout.SOUTH);
		actualizarDos.setTitle("Actualizar");
		actualizarDos.setSize(250,300);
		actualizarDos.setLocation(50,50);
		actualizarDos.setVisible(true);
		
	}public void eliminarLibro() {
		JFrame eliminarDos = new JFrame();
		Panel panel1 = new Panel();
		Panel panel11 = new Panel();
		Panel panelEliminar = new Panel();
		JLabel ingresar1 = new JLabel("Eliminar Datos Libro");
		JLabel ingresarNom = new JLabel("Ingrese el titulo ");
		
		JTextField ingresarNomb = new JTextField(10);
		JButton eliminar = new JButton("Eliminar");
		
		
		panel1.add(ingresar1);
		panel11.add(ingresarNom);
		panel11.add(ingresarNomb);
		panelEliminar.add(eliminar);
		eliminarDos.add(panel1, BorderLayout.NORTH);
		eliminarDos.add(panel11);
		eliminarDos.add(panelEliminar, BorderLayout.SOUTH);
		eliminarDos.setTitle("Eliminar");
		eliminarDos.setSize(250,250);
		eliminarDos.setLocation(50,50);
		eliminarDos.setVisible(true);
	}
	
	
	public void usuario() {
		//Creamos el JFRAMe de usuario
		JFrame usuario = new JFrame();
		Panel panelNorte = new Panel(new GridLayout(3,1));
		Panel panelCentro = new Panel(new GridLayout(2,2));
		JLabel bienvenida = new JLabel("Bienvenidos a Usuario" , JLabel.CENTER);
		Font fuenteBienvenida = new Font("Arial", Font.BOLD, 20);
		bienvenida.setFont(fuenteBienvenida);
		JLabel bOpciones = new JLabel("Seleccionar la opcion necesaria ", JLabel.CENTER);
		//Creamos cuatro botones y hacemos que sean cliqueables
		Button crear = new Button("1. Crear Usuario");
		crear.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				crearUsuario();
			}
		});
		Button buscar  = new Button("2. Buscar Usuario");
		buscar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				buscarUsuario();
			}
		});
		Button actualizar = new Button("3. Actualizar Usuario ");
		actualizar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				actualizarUsuario();
			}
		});
		Button eliminar = new Button("4. Eliminar Usuario");
		eliminar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				eliminarUsuario();
			}
		});
		//Agregamos al panel y luego al JFrame
		panelNorte.add(bienvenida);
		panelNorte.add(bOpciones);
		
		panelCentro.add(crear);
		panelCentro.add(buscar);
		panelCentro.add(actualizar);
		panelCentro.add(eliminar);

		usuario.add(panelNorte, BorderLayout.NORTH);
		usuario.add(panelCentro, BorderLayout.CENTER);
		//Damos las caracteristicas a la ventana
		usuario.setTitle("Usuario");
		usuario.setSize(500,300);
		usuario.setLocation(50,50);
		usuario.setVisible(true);
	}
	//Creamos 4 metodos que contienen los 4 JFrames y el CRUD de Usuario
	public void crearUsuario() {
		
		JFrame crearDos = new JFrame();
		Panel panelN = new Panel();
		Panel panelD = new Panel();
		Panel panel3 = new Panel();
		JLabel ingresar = new JLabel("Ingreso de Datos Usuario");
		JLabel ingrsarNombre = new JLabel("Nombre ");
		JTextField ingresarN = new JTextField(10);
		JLabel ingresarIde = new JLabel("Identificación ");
		JTextField ingresarD = new JTextField(10);
		JLabel ingresarCorreo= new JLabel("Correo ");
		JTextField ingresarC = new JTextField(10);
		JButton crear = new JButton("Crear");
		panelN.add(ingresar);
		panelD.add(ingrsarNombre);
		panelD.add(ingresarN);
		panelD.add(ingresarIde);
		panelD.add(ingresarD);
		panelD.add(ingresarCorreo);
		panelD.add(ingresarC);
		panel3.add(crear);
		crearDos.add(panelN, BorderLayout.NORTH);
		crearDos.add(panelD);
		crearDos.add(panel3, BorderLayout.SOUTH);
		crearDos.setTitle("Crear");
		crearDos.setSize(250, 250);
		crearDos.setLocation(50,50);
		crearDos.setVisible(true);
		}
		public void buscarUsuario() {
		JFrame buscarDos = new JFrame();
		Panel panel1 = new Panel();
		Panel panel11 = new Panel();
		Panel panel12 = new Panel();
		JLabel ingresar1 = new JLabel("Buscar Datos Usuario", JLabel.CENTER);
		JLabel ingresarNom = new JLabel("Identificación ");
		JTextField ingresarNomb = new JTextField(10);
		
		JButton buscar = new JButton("Buscar");
		panel1.add(ingresar1);
		panel11.add(ingresarNom);
		panel11.add(ingresarNomb);
		panel12.add(buscar);
		

		buscarDos.add(panel1, BorderLayout.NORTH);
		buscarDos.add(panel11);
		buscarDos.add(panel12,BorderLayout.SOUTH);
		buscarDos.setTitle("Buscar");
		buscarDos.setSize(400, 300);
		buscarDos.setLocation(50,50);
		buscarDos.setVisible(true);
		}
		public void actualizarUsuario() {
			JFrame actualizarDos = new JFrame();
			Panel panel1 = new Panel();
			Panel panel11 = new Panel();
			Panel panel3= new Panel();
			JLabel ingresar1 = new JLabel("Actualizar  Datos Usuario");
			JLabel ingresarIde = new JLabel("Identificación ");
			JTextField ingresarD = new JTextField(10);
			JLabel ingersarNombre = new JLabel("Nombre a Actualizar ");
			JTextField ingresarN = new JTextField(10);
			JLabel ingresarCorreo = new JLabel("Correo a Actualizar ");
			JTextField ingresarC = new JTextField(10);
			JButton actualizar = new JButton("Actualizar");
			panel1.add(ingresar1);
			panel11.add(ingresarIde);
			panel11.add(ingresarD);
			panel11.add(ingersarNombre);
			panel11.add(ingresarN);
			panel11.add(ingresarCorreo);
			panel11.add(ingresarC);
			panel3.add(actualizar);
			actualizarDos.add(panel1, BorderLayout.NORTH);
			actualizarDos.add(panel11);
			actualizarDos.add(panel3, BorderLayout.SOUTH);
			actualizarDos.setTitle("Actualizar");
			actualizarDos.setSize(250,300);
			actualizarDos.setLocation(50,50);
			actualizarDos.setVisible(true);
			
		}public void eliminarUsuario() {
			//Creamos le frame para eliminar usuario 
			JFrame eliminarDos = new JFrame();
			Panel panel1 = new Panel();
			Panel panel11 = new Panel();
			Panel panelEliminar = new Panel();
			//Creamos dos label
			JLabel ingresar1 = new JLabel("Eliminar Datos Usuario");
			JLabel ingresarIde = new JLabel("Identificación ");
			//Creamos un cuadro de texto y un boton eliminar
			JTextField ingresarNomb = new JTextField(10);
			JButton eliminar = new JButton("Eliminar");
			
			//agregamos a los paneles y luegos al JFrame
			panel1.add(ingresar1);
			panel11.add(ingresarIde);
			panel11.add(ingresarNomb);
			panelEliminar.add(eliminar);
			eliminarDos.add(panel1, BorderLayout.NORTH);
			eliminarDos.add(panel11);
			eliminarDos.add(panelEliminar, BorderLayout.SOUTH);
			eliminarDos.setTitle("Eliminar");
			eliminarDos.setSize(250,250);
			eliminarDos.setLocation(50,50);
			eliminarDos.setVisible(true);
		}
	
	public void prestamo() {
		//Creamos el frame prestamo 
		JFrame prestamo = new JFrame();
		Panel panelNorte = new Panel(new GridLayout(3,1));
		Panel panelCentro = new Panel(new GridLayout(2,2));
		//Creamos label y botones
		JLabel bienvenida = new JLabel("Bienvenidos a Prestamo" , JLabel.CENTER);
		Font fuenteBienvenida = new Font("Arial", Font.BOLD, 20);
		bienvenida.setFont(fuenteBienvenida);
		JLabel bOpciones = new JLabel("Seleccionar la opcion necesaria ", JLabel.CENTER);
		//Creamos botos y aplicamos para que sea cliqueable 
		Button crear = new Button("1. Crear Prestamo");
		crear.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				crearPrestamo();
			}
		});
		Button buscar  = new Button("2. Buscar Prestamo");
		buscar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				buscarPrestamo();
			}
		});
		Button actualizar = new Button("3. Actualizar Prestamo ");
		actualizar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				actualizarPrestamo();
			}
		});
		Button eliminar = new Button("4. Eliminar Prestamo");
		eliminar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				eliminarPrestamo();
			}
		});
		//agregamos al panel y luego al JFrame 
		panelNorte.add(bienvenida);
		panelNorte.add(bOpciones);
		
		panelCentro.add(crear);
		panelCentro.add(buscar);
		panelCentro.add(actualizar);
		panelCentro.add(eliminar);

		prestamo.add(panelNorte, BorderLayout.NORTH);
		prestamo.add(panelCentro, BorderLayout.CENTER);

		prestamo.setTitle("Prestamo");
		prestamo.setSize(500,300);
		prestamo.setLocation(50,50);
		prestamo.setVisible(true);
	}
	//Creamos cuatro metodos con 4 JFrames para lo 
	//que es crear, eliminar, buscar y actualizar 
	public void crearPrestamo() {
		
		JFrame crearDos = new JFrame();
		Panel panelN = new Panel();
		Panel panelD = new Panel(new GridLayout(7,2));
		Panel panel3 = new Panel();
		JLabel ingresar = new JLabel("Ingreso de Datos Usuario");
		JLabel ingrsarNum = new JLabel("N° Prestamo");
		JTextField ingresarN = new JTextField(10);
		Label fecha = new Label("Fecha de Devolución", Label.CENTER);
		JLabel espacio = new JLabel("    ");
		JLabel ingresarDia = new JLabel("Dia ");
		JTextField ingresarD = new JTextField(10);
		JLabel ingresarMes= new JLabel("Mes ");
		JTextField ingresarM = new JTextField(10);
		JLabel ingresarAño= new JLabel("Mes ");
		JTextField ingresarA = new JTextField(10);
		JLabel ingresarIde= new JLabel("Identificación");
		JTextField ingresarI = new JTextField(10);
		JLabel ingresarLibros= new JLabel("Libros ");
		JTextField ingresarL = new JTextField(10);
		JButton crear = new JButton("Crear");
		panelN.add(ingresar);
		panelD.add(ingrsarNum);
		panelD.add(ingresarN);
		panelD.add(fecha);
		panelD.add(espacio);
		panelD.add(ingresarDia);
		panelD.add(ingresarD);
		panelD.add(ingresarMes);
		panelD.add(ingresarM);
		panelD.add(ingresarAño);
		panelD.add(ingresarA);
		panelD.add(ingresarIde);
		panelD.add(ingresarI);
		panelD.add(ingresarLibros);
		panelD.add(ingresarL);
		panel3.add(crear);
		crearDos.add(panelN, BorderLayout.NORTH);
		crearDos.add(panelD);
		crearDos.add(panel3, BorderLayout.SOUTH);
		crearDos.setTitle("Crear");
		crearDos.setSize(300, 300);
		crearDos.setLocation(50,50);
		crearDos.setVisible(true);
		}
		public void buscarPrestamo() {
		JFrame buscarDos = new JFrame();
		Panel panel1 = new Panel();
		Panel panel11 = new Panel();
		Panel panel12 = new Panel();
		JLabel ingresar1 = new JLabel("Buscar Datos Prestamo", JLabel.CENTER);
		JLabel ingresarNum = new JLabel("N° Prestamo ");
		JTextField ingresarNume = new JTextField(10);
		
		JButton buscar = new JButton("Buscar");
		panel1.add(ingresar1);
		panel11.add(ingresarNum);
		panel11.add(ingresarNume);
		panel12.add(buscar);
		

		buscarDos.add(panel1, BorderLayout.NORTH);
		buscarDos.add(panel11);
		buscarDos.add(panel12,BorderLayout.SOUTH);
		buscarDos.setTitle("Buscar");
		buscarDos.setSize(400, 300);
		buscarDos.setLocation(50,50);
		buscarDos.setVisible(true);
		}
		public void actualizarPrestamo() {
			JFrame actualizarDos = new JFrame();
			Panel panel1 = new Panel();
			Panel panel11 = new Panel(new GridLayout(7,2));
			Panel panel3= new Panel();
			JLabel ingresar1 = new JLabel("Actualizar  Datos Prestamo");
			JLabel ingrsarNum = new JLabel("N° Prestamo");
			JTextField ingresarN = new JTextField(10);
			Label fecha = new Label("Fecha de Devolución", Label.CENTER);
			JLabel espacio = new JLabel( "   " );
			JLabel iingresarDia = new JLabel("Dia ");
			JTextField ingresarD = new JTextField(10);
			JLabel ingresarMes= new JLabel("Mes ");
			JTextField ingresarM = new JTextField(10);
			JLabel ingresarAño= new JLabel("Año ");
			JTextField ingresarA = new JTextField(10);
			JLabel ingresarIde= new JLabel("Agregar libros");
			JTextField ingresarI = new JTextField(10);
			JLabel ingresarLibros= new JLabel("Eliminar libros ");
			JTextField ingresarL = new JTextField(10);
			JButton actualizar = new JButton("Actualizar");
			panel1.add(ingresar1);
			panel11.add(ingrsarNum);
			panel11.add(ingresarN);
			panel11.add(fecha);
			panel11.add(espacio);
			panel11.add(iingresarDia);
			panel11.add(ingresarD);
			panel11.add(ingresarMes);
			panel11.add(ingresarM);
			panel11.add(ingresarAño);
			panel11.add(ingresarA);
			panel11.add(ingresarIde);
			panel11.add(ingresarI);
			panel11.add(ingresarLibros);
			panel11.add(ingresarL);
			
			panel3.add(actualizar);
			actualizarDos.add(panel1, BorderLayout.NORTH);
			actualizarDos.add(panel11,BorderLayout.CENTER);
			actualizarDos.add(panel3, BorderLayout.SOUTH);
			actualizarDos.setTitle("Actualizar");
			actualizarDos.setSize(250,300);
			actualizarDos.setLocation(50,50);
			actualizarDos.setVisible(true);
			
		}public void eliminarPrestamo() {
			//Creamos el JFrame en donde se va a vizualiza
			JFrame eliminarDos = new JFrame();
			Panel panel1 = new Panel();
			Panel panel11 = new Panel();
			Panel panelEliminar = new Panel();
			JLabel ingresar1 = new JLabel("Eliminar Datos Prestamo");
			JLabel ingresarNum = new JLabel("N° Prestamo ");
			JTextField ingresarN = new JTextField(10);
			JButton eliminar = new JButton("Eliminar");
			
			
			panel1.add(ingresar1);
			panel11.add(ingresarNum);
			panel11.add(ingresarN);
			panelEliminar.add(eliminar);
			eliminarDos.add(panel1, BorderLayout.NORTH);
			eliminarDos.add(panel11);
			eliminarDos.add(panelEliminar, BorderLayout.SOUTH);
			eliminarDos.setTitle("Eliminar");
			eliminarDos.setSize(250,250);
			eliminarDos.setLocation(50,50);
			eliminarDos.setVisible(true);
		}
}
