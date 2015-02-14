package graphicinterface;

import gamelogic.Board;
import gamelogic.Pawn;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.TitledBorder;

import sockets.Message;
import sockets.Client;
import util.ComponentImageFile;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

public class CheckersBoardClientGUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfServer;
	private JLabel label00;
	private JLabel label01;
	private JLabel label02;
	private JLabel label04;
	private JLabel label05;
	private JLabel label06;
	private JLabel label07;
	private JLabel label10;
	private JLabel label11;
	private JLabel label12;
	private JLabel label13;
	private JLabel label14;
	private JLabel label15;
	private JLabel label16;
	private JLabel label17;
	private JLabel label20;
	private JLabel label21;
	private JLabel label22;
	private JLabel label23;
	private JLabel label24;
	private JLabel label25;
	private JLabel label26;
	private JLabel label27;
	private JLabel label30;
	private JLabel label31;
	private JLabel label32;
	private JLabel label33;
	private JLabel label34;
	private JLabel label35;
	private JLabel label36;
	private JLabel label37;
	private JLabel label40;
	private JLabel label41;
	private JLabel label42;
	private JLabel label43;
	private JLabel label44;
	private JLabel label45;
	private JLabel label46;
	private JLabel label47;
	private JLabel label50;
	private JLabel label51;
	private JLabel label52;
	private JLabel label53;
	private JLabel label54;
	private JLabel label55;
	private JLabel label56;
	private JLabel label57;
	private JLabel label60;
	private JLabel label61;
	private JLabel label62;
	private JLabel label63;
	private JLabel label64;
	private JLabel label65;
	private JLabel label66;
	private JLabel label67;
	private JLabel label70;
	private JLabel label71;
	private JLabel label72;
	private JLabel label73;
	private JLabel label74;
	private JLabel label75;
	private JLabel label76;
	private JLabel label77;
	private JTextArea history;
	private JPanel panelHistory;
	private JPanel panelBoard;
	private JLabel lblPortNumber;
	private JPanel panelConnection;
	private JComponent componentBefore;
	private JLabel label03;

	private boolean action = false;
	Board board;
	private JLabel lblPort;
	private JTextField tfPort;
	private JButton login;
	private JButton logout;
	private boolean connected;
	// the Client object
	private Client client;
	// the default port number
	private int defaultPort;
	private String defaultHost;
	private JPanel panel;
	private JTextArea serverStatus;
	private JScrollPane scrollPane;
	private JScrollPane scrollPane_1;
	private JLabel label;
	private JLabel label_1;
	private JLabel label_2;
	private JLabel label_3;
	private JLabel label_4;
	private JLabel label_5;
	private JLabel label_6;
	private JLabel label_7;
	private JLabel label_8;
	private JLabel label_9;
	private JLabel label_10;
	private JLabel label_11;
	private JLabel label_12;
	private JLabel label_13;
	private JLabel label_14;
	private JLabel label_15;

	public CheckersBoardClientGUI(String host, int port) {
		board = new Board();
		defaultPort = port;
		defaultHost = host;
		setTitle("Checkers Client");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 644, 475);
		setSize(new Dimension(890, 700));
		setResizable(false);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[] { 296, 122, 0 };
		gbl_contentPane.rowHeights = new int[] { 0, 0, 0, 0 };
		gbl_contentPane.columnWeights = new double[] { 0.0, 1.0,
				Double.MIN_VALUE };
		gbl_contentPane.rowWeights = new double[] { 0.0, 1.0, 1.0,
				Double.MIN_VALUE };
		contentPane.setLayout(gbl_contentPane);

		panelConnection = new JPanel();
		panelConnection.setBorder(new TitledBorder(new LineBorder(new Color(0,
				0, 0), 3, true), "Connection", TitledBorder.LEADING,
				TitledBorder.TOP, null, null));
		GridBagConstraints gbc_panelConnection = new GridBagConstraints();
		gbc_panelConnection.gridwidth = 2;
		gbc_panelConnection.insets = new Insets(0, 0, 5, 0);
		gbc_panelConnection.fill = GridBagConstraints.BOTH;
		gbc_panelConnection.gridx = 0;
		gbc_panelConnection.gridy = 0;
		contentPane.add(panelConnection, gbc_panelConnection);
		GridBagLayout gbl_panelConnection = new GridBagLayout();
		gbl_panelConnection.columnWidths = new int[] { 0, 0, 0, 0, 0, 0, 0, 0 };
		gbl_panelConnection.rowHeights = new int[] { 0, 0 };
		gbl_panelConnection.columnWeights = new double[] { 0.0, 1.0, 0.0, 0.0,
				1.0, 0.0, 0.0, Double.MIN_VALUE };
		gbl_panelConnection.rowWeights = new double[] { 0.0, Double.MIN_VALUE };
		panelConnection.setLayout(gbl_panelConnection);

		lblPortNumber = new JLabel("Address Number:");
		GridBagConstraints gbc_lblPortNumber = new GridBagConstraints();
		gbc_lblPortNumber.anchor = GridBagConstraints.ABOVE_BASELINE_TRAILING;
		gbc_lblPortNumber.insets = new Insets(0, 0, 0, 5);
		gbc_lblPortNumber.gridx = 0;
		gbc_lblPortNumber.gridy = 0;
		panelConnection.add(lblPortNumber, gbc_lblPortNumber);

		tfServer = new JTextField();
		tfServer.setText("localhost");
		GridBagConstraints gbc_tfServer = new GridBagConstraints();
		gbc_tfServer.anchor = GridBagConstraints.NORTH;
		gbc_tfServer.insets = new Insets(0, 0, 0, 5);
		gbc_tfServer.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfServer.gridx = 1;
		gbc_tfServer.gridy = 0;
		panelConnection.add(tfServer, gbc_tfServer);
		tfServer.setColumns(10);

		lblPort = new JLabel("Port:");
		GridBagConstraints gbc_lblPort = new GridBagConstraints();
		gbc_lblPort.insets = new Insets(0, 0, 0, 5);
		gbc_lblPort.anchor = GridBagConstraints.EAST;
		gbc_lblPort.gridx = 3;
		gbc_lblPort.gridy = 0;
		panelConnection.add(lblPort, gbc_lblPort);

		tfPort = new JTextField();
		tfPort.setText("1500");
		GridBagConstraints gbc_tfPort = new GridBagConstraints();
		gbc_tfPort.insets = new Insets(0, 0, 0, 5);
		gbc_tfPort.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfPort.gridx = 4;
		gbc_tfPort.gridy = 0;
		panelConnection.add(tfPort, gbc_tfPort);
		tfPort.setColumns(10);

		login = new JButton("Play");
		login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionPerformedJButtonLogin(e);
			}
		});
		GridBagConstraints gbc_login = new GridBagConstraints();
		gbc_login.insets = new Insets(0, 0, 0, 5);
		gbc_login.gridx = 5;
		gbc_login.gridy = 0;
		panelConnection.add(login, gbc_login);

		logout = new JButton("Stop");
		logout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				client.sendMessage(new Message(Message.STOP, ""));
				return;
			}
		});
		GridBagConstraints gbc_logout = new GridBagConstraints();
		gbc_logout.gridx = 6;
		gbc_logout.gridy = 0;
		panelConnection.add(logout, gbc_logout);

		panelBoard = new JPanel();
		panelBoard.setBorder(new TitledBorder(new LineBorder(
				new Color(0, 0, 0), 3, true), "Board", TitledBorder.LEADING,
				TitledBorder.TOP, null, null));
		GridBagConstraints gbc_panelBoard = new GridBagConstraints();
		gbc_panelBoard.gridheight = 2;
		gbc_panelBoard.insets = new Insets(0, 0, 0, 5);
		gbc_panelBoard.fill = GridBagConstraints.BOTH;
		gbc_panelBoard.gridx = 0;
		gbc_panelBoard.gridy = 1;
		contentPane.add(panelBoard, gbc_panelBoard);
		GridBagLayout gbl_panelBoard = new GridBagLayout();
		gbl_panelBoard.columnWidths = new int[] { 33, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gbl_panelBoard.rowHeights = new int[] { 33, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gbl_panelBoard.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0,
				0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		gbl_panelBoard.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0,
				0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		panelBoard.setLayout(gbl_panelBoard);

		label_8 = new JLabel("1");
		label_8.setFont(new Font("Tahoma", Font.BOLD, 17));
		GridBagConstraints gbc_label_8 = new GridBagConstraints();
		gbc_label_8.anchor = GridBagConstraints.SOUTH;
		gbc_label_8.insets = new Insets(0, 0, 5, 5);
		gbc_label_8.gridx = 1;
		gbc_label_8.gridy = 0;
		panelBoard.add(label_8, gbc_label_8);

		label_9 = new JLabel("2");
		label_9.setFont(new Font("Tahoma", Font.BOLD, 17));
		GridBagConstraints gbc_label_9 = new GridBagConstraints();
		gbc_label_9.anchor = GridBagConstraints.SOUTH;
		gbc_label_9.insets = new Insets(0, 0, 5, 5);
		gbc_label_9.gridx = 2;
		gbc_label_9.gridy = 0;
		panelBoard.add(label_9, gbc_label_9);

		label_10 = new JLabel("3");
		label_10.setFont(new Font("Tahoma", Font.BOLD, 17));
		GridBagConstraints gbc_label_10 = new GridBagConstraints();
		gbc_label_10.anchor = GridBagConstraints.SOUTH;
		gbc_label_10.insets = new Insets(0, 0, 5, 5);
		gbc_label_10.gridx = 3;
		gbc_label_10.gridy = 0;
		panelBoard.add(label_10, gbc_label_10);

		label_11 = new JLabel("4");
		label_11.setFont(new Font("Tahoma", Font.BOLD, 17));
		GridBagConstraints gbc_label_11 = new GridBagConstraints();
		gbc_label_11.anchor = GridBagConstraints.SOUTH;
		gbc_label_11.insets = new Insets(0, 0, 5, 5);
		gbc_label_11.gridx = 4;
		gbc_label_11.gridy = 0;
		panelBoard.add(label_11, gbc_label_11);

		label_12 = new JLabel("5");
		label_12.setFont(new Font("Tahoma", Font.BOLD, 17));
		GridBagConstraints gbc_label_12 = new GridBagConstraints();
		gbc_label_12.anchor = GridBagConstraints.SOUTH;
		gbc_label_12.insets = new Insets(0, 0, 5, 5);
		gbc_label_12.gridx = 5;
		gbc_label_12.gridy = 0;
		panelBoard.add(label_12, gbc_label_12);

		label_13 = new JLabel("6");
		label_13.setFont(new Font("Tahoma", Font.BOLD, 17));
		GridBagConstraints gbc_label_13 = new GridBagConstraints();
		gbc_label_13.anchor = GridBagConstraints.SOUTH;
		gbc_label_13.insets = new Insets(0, 0, 5, 5);
		gbc_label_13.gridx = 6;
		gbc_label_13.gridy = 0;
		panelBoard.add(label_13, gbc_label_13);

		label_14 = new JLabel("7");
		label_14.setFont(new Font("Tahoma", Font.BOLD, 17));
		GridBagConstraints gbc_label_14 = new GridBagConstraints();
		gbc_label_14.anchor = GridBagConstraints.SOUTH;
		gbc_label_14.insets = new Insets(0, 0, 5, 5);
		gbc_label_14.gridx = 7;
		gbc_label_14.gridy = 0;
		panelBoard.add(label_14, gbc_label_14);

		label_15 = new JLabel("8");
		label_15.setFont(new Font("Tahoma", Font.BOLD, 17));
		GridBagConstraints gbc_label_15 = new GridBagConstraints();
		gbc_label_15.anchor = GridBagConstraints.SOUTH;
		gbc_label_15.insets = new Insets(0, 0, 5, 0);
		gbc_label_15.gridx = 8;
		gbc_label_15.gridy = 0;
		panelBoard.add(label_15, gbc_label_15);

		label = new JLabel("1");
		label.setFont(new Font("Tahoma", Font.BOLD, 17));
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.insets = new Insets(0, 0, 5, 5);
		gbc_label.gridx = 0;
		gbc_label.gridy = 1;
		panelBoard.add(label, gbc_label);

		label00 = new JLabel("");
		label00.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null,
				null, null));
		label00.setForeground(Color.WHITE);
		label00.setBackground(Color.WHITE);
		label00.setOpaque(true);
		label00.setSize(new Dimension(8, 8));
		GridBagConstraints gbc_label00 = new GridBagConstraints();
		gbc_label00.fill = GridBagConstraints.BOTH;
		gbc_label00.insets = new Insets(0, 0, 5, 5);
		gbc_label00.gridx = 1;
		gbc_label00.gridy = 1;
		panelBoard.add(label00, gbc_label00);

		label01 = new JLabel("");
		label01.setName("01");
		label01.setIcon(new ImageIcon(CheckersBoardClientGUI.class
				.getResource("/img/grey.png")));
		label01.setHorizontalAlignment(SwingConstants.CENTER);
		label01.setHorizontalTextPosition(SwingConstants.CENTER);
		label01.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				mouseClickedFunction(e);
			}
		});
		label01.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		label01.setForeground(Color.BLACK);
		label01.setOpaque(true);
		label01.setBackground(Color.BLACK);
		GridBagConstraints gbc_label01 = new GridBagConstraints();
		gbc_label01.fill = GridBagConstraints.BOTH;
		gbc_label01.insets = new Insets(0, 0, 5, 5);
		gbc_label01.gridx = 2;
		gbc_label01.gridy = 1;
		panelBoard.add(label01, gbc_label01);

		label02 = new JLabel("");
		label02.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null,
				null, null));
		label02.setForeground(Color.WHITE);
		label02.setBackground(Color.WHITE);
		label02.setOpaque(true);
		GridBagConstraints gbc_label02 = new GridBagConstraints();
		gbc_label02.fill = GridBagConstraints.BOTH;
		gbc_label02.insets = new Insets(0, 0, 5, 5);
		gbc_label02.gridx = 3;
		gbc_label02.gridy = 1;
		panelBoard.add(label02, gbc_label02);

		label03 = new JLabel("");
		label03.setName("03");
		label03.setIcon(new ImageIcon(CheckersBoardClientGUI.class
				.getResource("/img/grey.png")));
		label03.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				mouseClickedFunction(e);
			}
		});
		label03.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		label03.setForeground(Color.BLACK);
		label03.setOpaque(true);
		label03.setBackground(Color.BLACK);
		GridBagConstraints gbc_label03 = new GridBagConstraints();
		gbc_label03.fill = GridBagConstraints.BOTH;
		gbc_label03.insets = new Insets(0, 0, 5, 5);
		gbc_label03.gridx = 4;
		gbc_label03.gridy = 1;
		panelBoard.add(label03, gbc_label03);

		label04 = new JLabel("");
		label04.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null,
				null, null));
		label04.setForeground(Color.WHITE);
		label04.setBackground(Color.WHITE);
		label04.setOpaque(true);
		GridBagConstraints gbc_label04 = new GridBagConstraints();
		gbc_label04.fill = GridBagConstraints.BOTH;
		gbc_label04.insets = new Insets(0, 0, 5, 5);
		gbc_label04.gridx = 5;
		gbc_label04.gridy = 1;
		panelBoard.add(label04, gbc_label04);

		label05 = new JLabel("");
		label05.setName("05");
		label05.setIcon(new ImageIcon(CheckersBoardClientGUI.class
				.getResource("/img/grey.png")));
		label05.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				mouseClickedFunction(e);
			}
		});
		label05.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		label05.setForeground(Color.BLACK);
		label05.setOpaque(true);
		label05.setBackground(Color.BLACK);
		GridBagConstraints gbc_label05 = new GridBagConstraints();
		gbc_label05.fill = GridBagConstraints.BOTH;
		gbc_label05.insets = new Insets(0, 0, 5, 5);
		gbc_label05.gridx = 6;
		gbc_label05.gridy = 1;
		panelBoard.add(label05, gbc_label05);

		label06 = new JLabel("");
		label06.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null,
				null, null));
		label06.setForeground(Color.WHITE);
		label06.setBackground(Color.WHITE);
		label06.setOpaque(true);
		GridBagConstraints gbc_label06 = new GridBagConstraints();
		gbc_label06.fill = GridBagConstraints.BOTH;
		gbc_label06.insets = new Insets(0, 0, 5, 5);
		gbc_label06.gridx = 7;
		gbc_label06.gridy = 1;
		panelBoard.add(label06, gbc_label06);

		label07 = new JLabel("");
		label07.setName("07");
		label07.setIcon(new ImageIcon(CheckersBoardClientGUI.class
				.getResource("/img/grey.png")));
		label07.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				mouseClickedFunction(e);
			}
		});
		label07.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		label07.setForeground(Color.BLACK);
		label07.setOpaque(true);
		label07.setBackground(Color.BLACK);
		GridBagConstraints gbc_label07 = new GridBagConstraints();
		gbc_label07.fill = GridBagConstraints.BOTH;
		gbc_label07.insets = new Insets(0, 0, 5, 0);
		gbc_label07.gridx = 8;
		gbc_label07.gridy = 1;
		panelBoard.add(label07, gbc_label07);

		label10 = new JLabel("");
		label10.setName("10");
		label10.setIcon(new ImageIcon(CheckersBoardClientGUI.class
				.getResource("/img/grey.png")));
		label10.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				mouseClickedFunction(e);
			}
		});

		label_1 = new JLabel("2");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		GridBagConstraints gbc_label_1 = new GridBagConstraints();
		gbc_label_1.insets = new Insets(0, 0, 5, 5);
		gbc_label_1.gridx = 0;
		gbc_label_1.gridy = 2;
		panelBoard.add(label_1, gbc_label_1);
		label10.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		label10.setForeground(Color.BLACK);
		label10.setOpaque(true);
		label10.setBackground(Color.BLACK);
		GridBagConstraints gbc_label10 = new GridBagConstraints();
		gbc_label10.fill = GridBagConstraints.BOTH;
		gbc_label10.insets = new Insets(0, 0, 5, 5);
		gbc_label10.gridx = 1;
		gbc_label10.gridy = 2;
		panelBoard.add(label10, gbc_label10);

		label11 = new JLabel("");
		label11.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null,
				null, null));
		label11.setForeground(Color.WHITE);
		label11.setBackground(Color.WHITE);
		label11.setOpaque(true);
		GridBagConstraints gbc_label11 = new GridBagConstraints();
		gbc_label11.fill = GridBagConstraints.BOTH;
		gbc_label11.insets = new Insets(0, 0, 5, 5);
		gbc_label11.gridx = 2;
		gbc_label11.gridy = 2;
		panelBoard.add(label11, gbc_label11);

		label12 = new JLabel("");
		label12.setName("12");
		label12.setIcon(new ImageIcon(CheckersBoardClientGUI.class
				.getResource("/img/grey.png")));
		label12.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				mouseClickedFunction(e);
			}
		});
		label12.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		label12.setForeground(Color.BLACK);
		label12.setOpaque(true);
		label12.setBackground(Color.BLACK);
		GridBagConstraints gbc_label12 = new GridBagConstraints();
		gbc_label12.fill = GridBagConstraints.BOTH;
		gbc_label12.insets = new Insets(0, 0, 5, 5);
		gbc_label12.gridx = 3;
		gbc_label12.gridy = 2;
		panelBoard.add(label12, gbc_label12);

		label13 = new JLabel("");
		label13.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null,
				null, null));
		label13.setForeground(Color.WHITE);
		label13.setBackground(Color.WHITE);
		label13.setOpaque(true);
		GridBagConstraints gbc_label13 = new GridBagConstraints();
		gbc_label13.fill = GridBagConstraints.BOTH;
		gbc_label13.insets = new Insets(0, 0, 5, 5);
		gbc_label13.gridx = 4;
		gbc_label13.gridy = 2;
		panelBoard.add(label13, gbc_label13);

		label14 = new JLabel("");
		label14.setName("14");
		label14.setIcon(new ImageIcon(CheckersBoardClientGUI.class
				.getResource("/img/grey.png")));
		label14.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				mouseClickedFunction(e);
			}
		});
		label14.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		label14.setForeground(Color.BLACK);
		label14.setOpaque(true);
		label14.setBackground(Color.BLACK);
		GridBagConstraints gbc_label14 = new GridBagConstraints();
		gbc_label14.fill = GridBagConstraints.BOTH;
		gbc_label14.insets = new Insets(0, 0, 5, 5);
		gbc_label14.gridx = 5;
		gbc_label14.gridy = 2;
		panelBoard.add(label14, gbc_label14);

		label15 = new JLabel("");
		label15.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null,
				null, null));
		label15.setForeground(Color.WHITE);
		label15.setBackground(Color.WHITE);
		label15.setOpaque(true);
		GridBagConstraints gbc_label15 = new GridBagConstraints();
		gbc_label15.fill = GridBagConstraints.BOTH;
		gbc_label15.insets = new Insets(0, 0, 5, 5);
		gbc_label15.gridx = 6;
		gbc_label15.gridy = 2;
		panelBoard.add(label15, gbc_label15);

		label16 = new JLabel("");
		label16.setName("16");
		label16.setIcon(new ImageIcon(CheckersBoardClientGUI.class
				.getResource("/img/grey.png")));
		label16.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				mouseClickedFunction(e);
			}
		});
		label16.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		label16.setForeground(Color.BLACK);
		label16.setOpaque(true);
		label16.setBackground(Color.BLACK);
		GridBagConstraints gbc_label16 = new GridBagConstraints();
		gbc_label16.fill = GridBagConstraints.BOTH;
		gbc_label16.insets = new Insets(0, 0, 5, 5);
		gbc_label16.gridx = 7;
		gbc_label16.gridy = 2;
		panelBoard.add(label16, gbc_label16);

		label17 = new JLabel("");
		label17.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null,
				null, null));
		label17.setForeground(Color.WHITE);
		label17.setBackground(Color.WHITE);
		label17.setOpaque(true);
		GridBagConstraints gbc_label17 = new GridBagConstraints();
		gbc_label17.fill = GridBagConstraints.BOTH;
		gbc_label17.insets = new Insets(0, 0, 5, 0);
		gbc_label17.gridx = 8;
		gbc_label17.gridy = 2;
		panelBoard.add(label17, gbc_label17);

		label_2 = new JLabel("3");
		label_2.setFont(new Font("Tahoma", Font.BOLD, 17));
		GridBagConstraints gbc_label_2 = new GridBagConstraints();
		gbc_label_2.insets = new Insets(0, 0, 5, 5);
		gbc_label_2.gridx = 0;
		gbc_label_2.gridy = 3;
		panelBoard.add(label_2, gbc_label_2);

		label20 = new JLabel("");
		label20.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null,
				null, null));
		label20.setForeground(Color.WHITE);
		label20.setBackground(Color.WHITE);
		label20.setOpaque(true);
		GridBagConstraints gbc_label20 = new GridBagConstraints();
		gbc_label20.fill = GridBagConstraints.BOTH;
		gbc_label20.insets = new Insets(0, 0, 5, 5);
		gbc_label20.gridx = 1;
		gbc_label20.gridy = 3;
		panelBoard.add(label20, gbc_label20);

		label21 = new JLabel("");
		label21.setName("21");
		label21.setIcon(new ImageIcon(CheckersBoardClientGUI.class
				.getResource("/img/grey.png")));
		label21.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				mouseClickedFunction(e);
			}
		});
		label21.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		label21.setForeground(Color.BLACK);
		label21.setOpaque(true);
		label21.setBackground(Color.BLACK);
		GridBagConstraints gbc_label21 = new GridBagConstraints();
		gbc_label21.fill = GridBagConstraints.BOTH;
		gbc_label21.insets = new Insets(0, 0, 5, 5);
		gbc_label21.gridx = 2;
		gbc_label21.gridy = 3;
		panelBoard.add(label21, gbc_label21);

		label22 = new JLabel("");
		label22.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null,
				null, null));
		label22.setForeground(Color.WHITE);
		label22.setBackground(Color.WHITE);
		label22.setOpaque(true);
		GridBagConstraints gbc_label22 = new GridBagConstraints();
		gbc_label22.fill = GridBagConstraints.BOTH;
		gbc_label22.insets = new Insets(0, 0, 5, 5);
		gbc_label22.gridx = 3;
		gbc_label22.gridy = 3;
		panelBoard.add(label22, gbc_label22);

		label23 = new JLabel("");
		label23.setName("23");
		label23.setIcon(new ImageIcon(CheckersBoardClientGUI.class
				.getResource("/img/grey.png")));
		label23.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				mouseClickedFunction(e);
			}
		});
		label23.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		label23.setForeground(Color.BLACK);
		label23.setOpaque(true);
		label23.setBackground(Color.BLACK);
		GridBagConstraints gbc_label23 = new GridBagConstraints();
		gbc_label23.fill = GridBagConstraints.BOTH;
		gbc_label23.insets = new Insets(0, 0, 5, 5);
		gbc_label23.gridx = 4;
		gbc_label23.gridy = 3;
		panelBoard.add(label23, gbc_label23);

		label24 = new JLabel("");
		label24.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null,
				null, null));
		label24.setForeground(Color.WHITE);
		label24.setBackground(Color.WHITE);
		label24.setOpaque(true);
		GridBagConstraints gbc_label24 = new GridBagConstraints();
		gbc_label24.fill = GridBagConstraints.BOTH;
		gbc_label24.insets = new Insets(0, 0, 5, 5);
		gbc_label24.gridx = 5;
		gbc_label24.gridy = 3;
		panelBoard.add(label24, gbc_label24);

		label25 = new JLabel("");
		label25.setName("25");
		label25.setIcon(new ImageIcon(CheckersBoardClientGUI.class
				.getResource("/img/grey.png")));
		label25.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				mouseClickedFunction(e);
			}
		});
		label25.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		label25.setForeground(Color.BLACK);
		label25.setOpaque(true);
		label25.setBackground(Color.BLACK);
		GridBagConstraints gbc_label25 = new GridBagConstraints();
		gbc_label25.fill = GridBagConstraints.BOTH;
		gbc_label25.insets = new Insets(0, 0, 5, 5);
		gbc_label25.gridx = 6;
		gbc_label25.gridy = 3;
		panelBoard.add(label25, gbc_label25);

		label26 = new JLabel("");
		label26.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null,
				null, null));
		label26.setForeground(Color.WHITE);
		label26.setBackground(Color.WHITE);
		label26.setOpaque(true);
		GridBagConstraints gbc_label26 = new GridBagConstraints();
		gbc_label26.fill = GridBagConstraints.BOTH;
		gbc_label26.insets = new Insets(0, 0, 5, 5);
		gbc_label26.gridx = 7;
		gbc_label26.gridy = 3;
		panelBoard.add(label26, gbc_label26);

		label27 = new JLabel("");
		label27.setName("27");
		label27.setIcon(new ImageIcon(CheckersBoardClientGUI.class
				.getResource("/img/grey.png")));
		label27.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				mouseClickedFunction(e);
			}
		});
		label27.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		label27.setForeground(Color.BLACK);
		label27.setOpaque(true);
		label27.setBackground(Color.BLACK);
		GridBagConstraints gbc_label27 = new GridBagConstraints();
		gbc_label27.fill = GridBagConstraints.BOTH;
		gbc_label27.insets = new Insets(0, 0, 5, 0);
		gbc_label27.gridx = 8;
		gbc_label27.gridy = 3;
		panelBoard.add(label27, gbc_label27);

		label30 = new JLabel("");
		label30.setName("30");
		label30.setIcon(new ImageIcon(CheckersBoardClientGUI.class
				.getResource("/img/black.png")));
		label30.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				mouseClickedFunction(e);
			}
		});

		label_3 = new JLabel("4");
		label_3.setFont(new Font("Tahoma", Font.BOLD, 17));
		GridBagConstraints gbc_label_3 = new GridBagConstraints();
		gbc_label_3.insets = new Insets(0, 0, 5, 5);
		gbc_label_3.gridx = 0;
		gbc_label_3.gridy = 4;
		panelBoard.add(label_3, gbc_label_3);
		label30.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		label30.setForeground(Color.BLACK);
		label30.setOpaque(true);
		label30.setBackground(Color.BLACK);
		GridBagConstraints gbc_label30 = new GridBagConstraints();
		gbc_label30.fill = GridBagConstraints.BOTH;
		gbc_label30.insets = new Insets(0, 0, 5, 5);
		gbc_label30.gridx = 1;
		gbc_label30.gridy = 4;
		panelBoard.add(label30, gbc_label30);

		label31 = new JLabel("");
		label31.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null,
				null, null));
		label31.setForeground(Color.WHITE);
		label31.setBackground(Color.WHITE);
		label31.setOpaque(true);
		GridBagConstraints gbc_label31 = new GridBagConstraints();
		gbc_label31.fill = GridBagConstraints.BOTH;
		gbc_label31.insets = new Insets(0, 0, 5, 5);
		gbc_label31.gridx = 2;
		gbc_label31.gridy = 4;
		panelBoard.add(label31, gbc_label31);

		label32 = new JLabel("");
		label32.setName("32");
		label32.setIcon(new ImageIcon(CheckersBoardClientGUI.class
				.getResource("/img/black.png")));
		label32.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				mouseClickedFunction(e);
			}
		});
		label32.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		label32.setForeground(Color.BLACK);
		label32.setOpaque(true);
		label32.setBackground(Color.BLACK);
		GridBagConstraints gbc_label32 = new GridBagConstraints();
		gbc_label32.fill = GridBagConstraints.BOTH;
		gbc_label32.insets = new Insets(0, 0, 5, 5);
		gbc_label32.gridx = 3;
		gbc_label32.gridy = 4;
		panelBoard.add(label32, gbc_label32);

		label33 = new JLabel("");
		label33.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null,
				null, null));
		label33.setForeground(Color.WHITE);
		label33.setBackground(Color.WHITE);
		label33.setOpaque(true);
		GridBagConstraints gbc_label33 = new GridBagConstraints();
		gbc_label33.fill = GridBagConstraints.BOTH;
		gbc_label33.insets = new Insets(0, 0, 5, 5);
		gbc_label33.gridx = 4;
		gbc_label33.gridy = 4;
		panelBoard.add(label33, gbc_label33);

		label34 = new JLabel("");
		label34.setName("34");
		label34.setIcon(new ImageIcon(CheckersBoardClientGUI.class
				.getResource("/img/black.png")));
		label34.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				mouseClickedFunction(e);
			}
		});
		label34.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		label34.setForeground(Color.BLACK);
		label34.setOpaque(true);
		label34.setBackground(Color.BLACK);
		GridBagConstraints gbc_label34 = new GridBagConstraints();
		gbc_label34.fill = GridBagConstraints.BOTH;
		gbc_label34.insets = new Insets(0, 0, 5, 5);
		gbc_label34.gridx = 5;
		gbc_label34.gridy = 4;
		panelBoard.add(label34, gbc_label34);

		label35 = new JLabel("");
		label35.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null,
				null, null));
		label35.setForeground(Color.WHITE);
		label35.setBackground(Color.WHITE);
		label35.setOpaque(true);
		GridBagConstraints gbc_label35 = new GridBagConstraints();
		gbc_label35.fill = GridBagConstraints.BOTH;
		gbc_label35.insets = new Insets(0, 0, 5, 5);
		gbc_label35.gridx = 6;
		gbc_label35.gridy = 4;
		panelBoard.add(label35, gbc_label35);

		label36 = new JLabel("");
		label36.setName("36");
		label36.setIcon(new ImageIcon(CheckersBoardClientGUI.class
				.getResource("/img/black.png")));
		label36.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				mouseClickedFunction(e);
			}
		});
		label36.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		label36.setForeground(Color.BLACK);
		label36.setOpaque(true);
		label36.setBackground(Color.BLACK);
		GridBagConstraints gbc_label36 = new GridBagConstraints();
		gbc_label36.fill = GridBagConstraints.BOTH;
		gbc_label36.insets = new Insets(0, 0, 5, 5);
		gbc_label36.gridx = 7;
		gbc_label36.gridy = 4;
		panelBoard.add(label36, gbc_label36);

		label37 = new JLabel("");
		label37.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null,
				null, null));
		label37.setForeground(Color.WHITE);
		label37.setBackground(Color.WHITE);
		label37.setOpaque(true);
		GridBagConstraints gbc_label37 = new GridBagConstraints();
		gbc_label37.fill = GridBagConstraints.BOTH;
		gbc_label37.insets = new Insets(0, 0, 5, 0);
		gbc_label37.gridx = 8;
		gbc_label37.gridy = 4;
		panelBoard.add(label37, gbc_label37);

		label_4 = new JLabel("5");
		label_4.setFont(new Font("Tahoma", Font.BOLD, 17));
		GridBagConstraints gbc_label_4 = new GridBagConstraints();
		gbc_label_4.insets = new Insets(0, 0, 5, 5);
		gbc_label_4.gridx = 0;
		gbc_label_4.gridy = 5;
		panelBoard.add(label_4, gbc_label_4);

		label40 = new JLabel("");
		label40.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null,
				null, null));
		label40.setForeground(Color.WHITE);
		label40.setBackground(Color.WHITE);
		label40.setOpaque(true);
		GridBagConstraints gbc_label40 = new GridBagConstraints();
		gbc_label40.fill = GridBagConstraints.BOTH;
		gbc_label40.insets = new Insets(0, 0, 5, 5);
		gbc_label40.gridx = 1;
		gbc_label40.gridy = 5;
		panelBoard.add(label40, gbc_label40);

		label41 = new JLabel("");
		label41.setName("41");
		label41.setIcon(new ImageIcon(CheckersBoardClientGUI.class
				.getResource("/img/black.png")));
		label41.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				mouseClickedFunction(e);
			}
		});
		label41.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		label41.setForeground(Color.BLACK);
		label41.setOpaque(true);
		label41.setBackground(Color.BLACK);
		GridBagConstraints gbc_label41 = new GridBagConstraints();
		gbc_label41.fill = GridBagConstraints.BOTH;
		gbc_label41.insets = new Insets(0, 0, 5, 5);
		gbc_label41.gridx = 2;
		gbc_label41.gridy = 5;
		panelBoard.add(label41, gbc_label41);

		label42 = new JLabel("");
		label42.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null,
				null, null));
		label42.setForeground(Color.WHITE);
		label42.setBackground(Color.WHITE);
		label42.setOpaque(true);
		GridBagConstraints gbc_label42 = new GridBagConstraints();
		gbc_label42.fill = GridBagConstraints.BOTH;
		gbc_label42.insets = new Insets(0, 0, 5, 5);
		gbc_label42.gridx = 3;
		gbc_label42.gridy = 5;
		panelBoard.add(label42, gbc_label42);

		label43 = new JLabel("");
		label43.setName("43");
		label43.setIcon(new ImageIcon(CheckersBoardClientGUI.class
				.getResource("/img/black.png")));
		label43.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				mouseClickedFunction(e);
			}
		});
		label43.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		label43.setForeground(Color.BLACK);
		label43.setOpaque(true);
		label43.setBackground(Color.BLACK);
		GridBagConstraints gbc_label43 = new GridBagConstraints();
		gbc_label43.fill = GridBagConstraints.BOTH;
		gbc_label43.insets = new Insets(0, 0, 5, 5);
		gbc_label43.gridx = 4;
		gbc_label43.gridy = 5;
		panelBoard.add(label43, gbc_label43);

		label44 = new JLabel("");
		label44.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null,
				null, null));
		label44.setForeground(Color.WHITE);
		label44.setBackground(Color.WHITE);
		label44.setOpaque(true);
		GridBagConstraints gbc_label44 = new GridBagConstraints();
		gbc_label44.fill = GridBagConstraints.BOTH;
		gbc_label44.insets = new Insets(0, 0, 5, 5);
		gbc_label44.gridx = 5;
		gbc_label44.gridy = 5;
		panelBoard.add(label44, gbc_label44);

		label45 = new JLabel("");
		label45.setName("45");
		label45.setIcon(new ImageIcon(CheckersBoardClientGUI.class
				.getResource("/img/black.png")));
		label45.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				mouseClickedFunction(e);
			}
		});
		label45.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		label45.setForeground(Color.BLACK);
		label45.setOpaque(true);
		label45.setBackground(Color.BLACK);
		GridBagConstraints gbc_label45 = new GridBagConstraints();
		gbc_label45.fill = GridBagConstraints.BOTH;
		gbc_label45.insets = new Insets(0, 0, 5, 5);
		gbc_label45.gridx = 6;
		gbc_label45.gridy = 5;
		panelBoard.add(label45, gbc_label45);

		label46 = new JLabel("");
		label46.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null,
				null, null));
		label46.setForeground(Color.WHITE);
		label46.setBackground(Color.WHITE);
		label46.setOpaque(true);
		GridBagConstraints gbc_label46 = new GridBagConstraints();
		gbc_label46.fill = GridBagConstraints.BOTH;
		gbc_label46.insets = new Insets(0, 0, 5, 5);
		gbc_label46.gridx = 7;
		gbc_label46.gridy = 5;
		panelBoard.add(label46, gbc_label46);

		label47 = new JLabel("");
		label47.setName("47");
		label47.setIcon(new ImageIcon(CheckersBoardClientGUI.class
				.getResource("/img/black.png")));
		label47.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				mouseClickedFunction(e);
			}
		});
		label47.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		label47.setForeground(Color.BLACK);
		label47.setOpaque(true);
		label47.setBackground(Color.BLACK);
		GridBagConstraints gbc_label47 = new GridBagConstraints();
		gbc_label47.fill = GridBagConstraints.BOTH;
		gbc_label47.insets = new Insets(0, 0, 5, 0);
		gbc_label47.gridx = 8;
		gbc_label47.gridy = 5;
		panelBoard.add(label47, gbc_label47);

		label50 = new JLabel("");
		label50.setName("50");
		label50.setIcon(new ImageIcon(CheckersBoardClientGUI.class
				.getResource("/img/yellow.png")));
		label50.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				mouseClickedFunction(e);
			}
		});

		label_5 = new JLabel("6");
		label_5.setFont(new Font("Tahoma", Font.BOLD, 17));
		GridBagConstraints gbc_label_5 = new GridBagConstraints();
		gbc_label_5.insets = new Insets(0, 0, 5, 5);
		gbc_label_5.gridx = 0;
		gbc_label_5.gridy = 6;
		panelBoard.add(label_5, gbc_label_5);
		label50.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		label50.setForeground(Color.BLACK);
		label50.setOpaque(true);
		label50.setBackground(Color.BLACK);
		GridBagConstraints gbc_label50 = new GridBagConstraints();
		gbc_label50.fill = GridBagConstraints.BOTH;
		gbc_label50.insets = new Insets(0, 0, 5, 5);
		gbc_label50.gridx = 1;
		gbc_label50.gridy = 6;
		panelBoard.add(label50, gbc_label50);

		label51 = new JLabel("");
		label51.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null,
				null, null));
		label51.setForeground(Color.WHITE);
		label51.setBackground(Color.WHITE);
		label51.setOpaque(true);
		label51.setSize(new Dimension(8, 8));
		GridBagConstraints gbc_label51 = new GridBagConstraints();
		gbc_label51.fill = GridBagConstraints.BOTH;
		gbc_label51.insets = new Insets(0, 0, 5, 5);
		gbc_label51.gridx = 2;
		gbc_label51.gridy = 6;
		panelBoard.add(label51, gbc_label51);

		label52 = new JLabel("");
		label52.setName("52");
		label52.setIcon(new ImageIcon(CheckersBoardClientGUI.class
				.getResource("/img/yellow.png")));
		label52.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				mouseClickedFunction(e);
			}
		});
		label52.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		label52.setForeground(Color.BLACK);
		label52.setOpaque(true);
		label52.setBackground(Color.BLACK);
		GridBagConstraints gbc_label52 = new GridBagConstraints();
		gbc_label52.fill = GridBagConstraints.BOTH;
		gbc_label52.insets = new Insets(0, 0, 5, 5);
		gbc_label52.gridx = 3;
		gbc_label52.gridy = 6;
		panelBoard.add(label52, gbc_label52);

		label53 = new JLabel("");
		label53.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null,
				null, null));
		label53.setForeground(Color.WHITE);
		label53.setBackground(Color.WHITE);
		label53.setOpaque(true);
		GridBagConstraints gbc_label53 = new GridBagConstraints();
		gbc_label53.fill = GridBagConstraints.BOTH;
		gbc_label53.insets = new Insets(0, 0, 5, 5);
		gbc_label53.gridx = 4;
		gbc_label53.gridy = 6;
		panelBoard.add(label53, gbc_label53);

		label54 = new JLabel("");
		label54.setName("54");
		label54.setIcon(new ImageIcon(CheckersBoardClientGUI.class
				.getResource("/img/yellow.png")));
		label54.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				mouseClickedFunction(e);
			}
		});
		label54.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		label54.setForeground(Color.BLACK);
		label54.setOpaque(true);
		label54.setBackground(Color.BLACK);
		GridBagConstraints gbc_label54 = new GridBagConstraints();
		gbc_label54.fill = GridBagConstraints.BOTH;
		gbc_label54.insets = new Insets(0, 0, 5, 5);
		gbc_label54.gridx = 5;
		gbc_label54.gridy = 6;
		panelBoard.add(label54, gbc_label54);

		label55 = new JLabel("");
		label55.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null,
				null, null));
		label55.setForeground(Color.WHITE);
		label55.setBackground(Color.WHITE);
		label55.setOpaque(true);
		GridBagConstraints gbc_label55 = new GridBagConstraints();
		gbc_label55.fill = GridBagConstraints.BOTH;
		gbc_label55.insets = new Insets(0, 0, 5, 5);
		gbc_label55.gridx = 6;
		gbc_label55.gridy = 6;
		panelBoard.add(label55, gbc_label55);

		label56 = new JLabel("");
		label56.setName("56");
		label56.setIcon(new ImageIcon(CheckersBoardClientGUI.class
				.getResource("/img/yellow.png")));
		label56.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				mouseClickedFunction(e);
			}
		});
		label56.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		label56.setForeground(Color.BLACK);
		label56.setOpaque(true);
		label56.setBackground(Color.BLACK);
		GridBagConstraints gbc_label56 = new GridBagConstraints();
		gbc_label56.fill = GridBagConstraints.BOTH;
		gbc_label56.insets = new Insets(0, 0, 5, 5);
		gbc_label56.gridx = 7;
		gbc_label56.gridy = 6;
		panelBoard.add(label56, gbc_label56);

		label57 = new JLabel("");
		label57.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null,
				null, null));
		label57.setForeground(Color.WHITE);
		label57.setBackground(Color.WHITE);
		label57.setOpaque(true);
		GridBagConstraints gbc_label57 = new GridBagConstraints();
		gbc_label57.fill = GridBagConstraints.BOTH;
		gbc_label57.insets = new Insets(0, 0, 5, 0);
		gbc_label57.gridx = 8;
		gbc_label57.gridy = 6;
		panelBoard.add(label57, gbc_label57);

		label_6 = new JLabel("7");
		label_6.setFont(new Font("Tahoma", Font.BOLD, 17));
		GridBagConstraints gbc_label_6 = new GridBagConstraints();
		gbc_label_6.insets = new Insets(0, 0, 5, 5);
		gbc_label_6.gridx = 0;
		gbc_label_6.gridy = 7;
		panelBoard.add(label_6, gbc_label_6);

		label60 = new JLabel("");
		label60.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null,
				null, null));
		label60.setForeground(Color.WHITE);
		label60.setBackground(Color.WHITE);
		label60.setOpaque(true);
		GridBagConstraints gbc_label60 = new GridBagConstraints();
		gbc_label60.fill = GridBagConstraints.BOTH;
		gbc_label60.insets = new Insets(0, 0, 5, 5);
		gbc_label60.gridx = 1;
		gbc_label60.gridy = 7;
		panelBoard.add(label60, gbc_label60);

		label61 = new JLabel("");
		label61.setName("61");
		label61.setIcon(new ImageIcon(CheckersBoardClientGUI.class
				.getResource("/img/yellow.png")));
		label61.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				mouseClickedFunction(e);
			}
		});
		label61.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		label61.setForeground(Color.BLACK);
		label61.setOpaque(true);
		label61.setBackground(Color.BLACK);
		GridBagConstraints gbc_label61 = new GridBagConstraints();
		gbc_label61.fill = GridBagConstraints.BOTH;
		gbc_label61.insets = new Insets(0, 0, 5, 5);
		gbc_label61.gridx = 2;
		gbc_label61.gridy = 7;
		panelBoard.add(label61, gbc_label61);

		label62 = new JLabel("");
		label62.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null,
				null, null));
		label62.setForeground(Color.WHITE);
		label62.setBackground(Color.WHITE);
		label62.setOpaque(true);
		GridBagConstraints gbc_label62 = new GridBagConstraints();
		gbc_label62.fill = GridBagConstraints.BOTH;
		gbc_label62.insets = new Insets(0, 0, 5, 5);
		gbc_label62.gridx = 3;
		gbc_label62.gridy = 7;
		panelBoard.add(label62, gbc_label62);

		label63 = new JLabel("");
		label63.setName("63");
		label63.setIcon(new ImageIcon(CheckersBoardClientGUI.class
				.getResource("/img/yellow.png")));
		label63.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				mouseClickedFunction(e);
			}
		});
		label63.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		label63.setForeground(Color.BLACK);
		label63.setOpaque(true);
		label63.setBackground(Color.BLACK);
		GridBagConstraints gbc_label63 = new GridBagConstraints();
		gbc_label63.fill = GridBagConstraints.BOTH;
		gbc_label63.insets = new Insets(0, 0, 5, 5);
		gbc_label63.gridx = 4;
		gbc_label63.gridy = 7;
		panelBoard.add(label63, gbc_label63);

		label64 = new JLabel("");
		label64.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null,
				null, null));
		label64.setForeground(Color.WHITE);
		label64.setBackground(Color.WHITE);
		label64.setOpaque(true);
		GridBagConstraints gbc_label64 = new GridBagConstraints();
		gbc_label64.fill = GridBagConstraints.BOTH;
		gbc_label64.insets = new Insets(0, 0, 5, 5);
		gbc_label64.gridx = 5;
		gbc_label64.gridy = 7;
		panelBoard.add(label64, gbc_label64);

		label65 = new JLabel("");
		label65.setName("65");
		label65.setIcon(new ImageIcon(CheckersBoardClientGUI.class
				.getResource("/img/yellow.png")));
		label65.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				mouseClickedFunction(e);
			}
		});
		label65.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		label65.setForeground(Color.BLACK);
		label65.setOpaque(true);
		label65.setBackground(Color.BLACK);
		GridBagConstraints gbc_label65 = new GridBagConstraints();
		gbc_label65.fill = GridBagConstraints.BOTH;
		gbc_label65.insets = new Insets(0, 0, 5, 5);
		gbc_label65.gridx = 6;
		gbc_label65.gridy = 7;
		panelBoard.add(label65, gbc_label65);

		label66 = new JLabel("");
		label66.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null,
				null, null));
		label66.setForeground(Color.WHITE);
		label66.setBackground(Color.WHITE);
		label66.setOpaque(true);
		GridBagConstraints gbc_label66 = new GridBagConstraints();
		gbc_label66.fill = GridBagConstraints.BOTH;
		gbc_label66.insets = new Insets(0, 0, 5, 5);
		gbc_label66.gridx = 7;
		gbc_label66.gridy = 7;
		panelBoard.add(label66, gbc_label66);

		label67 = new JLabel("");
		label67.setName("67");
		label67.setIcon(new ImageIcon(CheckersBoardClientGUI.class
				.getResource("/img/yellow.png")));
		label67.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				mouseClickedFunction(e);
			}
		});
		label67.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		label67.setForeground(Color.BLACK);
		label67.setOpaque(true);
		label67.setBackground(Color.BLACK);
		GridBagConstraints gbc_label67 = new GridBagConstraints();
		gbc_label67.fill = GridBagConstraints.BOTH;
		gbc_label67.insets = new Insets(0, 0, 5, 0);
		gbc_label67.gridx = 8;
		gbc_label67.gridy = 7;
		panelBoard.add(label67, gbc_label67);

		label70 = new JLabel("");
		label70.setName("70");
		label70.setIcon(new ImageIcon(CheckersBoardClientGUI.class
				.getResource("/img/yellow.png")));
		label70.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				mouseClickedFunction(e);
			}
		});

		label_7 = new JLabel("8");
		label_7.setFont(new Font("Tahoma", Font.BOLD, 17));
		GridBagConstraints gbc_label_7 = new GridBagConstraints();
		gbc_label_7.insets = new Insets(0, 0, 0, 5);
		gbc_label_7.gridx = 0;
		gbc_label_7.gridy = 8;
		panelBoard.add(label_7, gbc_label_7);
		label70.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		label70.setForeground(Color.BLACK);
		label70.setOpaque(true);
		label70.setBackground(Color.BLACK);
		GridBagConstraints gbc_label70 = new GridBagConstraints();
		gbc_label70.fill = GridBagConstraints.BOTH;
		gbc_label70.insets = new Insets(0, 0, 0, 5);
		gbc_label70.gridx = 1;
		gbc_label70.gridy = 8;
		panelBoard.add(label70, gbc_label70);

		label71 = new JLabel("");
		label71.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null,
				null, null));
		label71.setForeground(Color.WHITE);
		label71.setBackground(Color.WHITE);
		label71.setOpaque(true);
		GridBagConstraints gbc_label71 = new GridBagConstraints();
		gbc_label71.fill = GridBagConstraints.BOTH;
		gbc_label71.insets = new Insets(0, 0, 0, 5);
		gbc_label71.gridx = 2;
		gbc_label71.gridy = 8;
		panelBoard.add(label71, gbc_label71);

		label72 = new JLabel("");
		label72.setName("72");
		label72.setIcon(new ImageIcon(CheckersBoardClientGUI.class
				.getResource("/img/yellow.png")));
		label72.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				mouseClickedFunction(e);
			}
		});
		label72.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		label72.setForeground(Color.BLACK);
		label72.setOpaque(true);
		label72.setBackground(Color.BLACK);
		GridBagConstraints gbc_label72 = new GridBagConstraints();
		gbc_label72.fill = GridBagConstraints.BOTH;
		gbc_label72.insets = new Insets(0, 0, 0, 5);
		gbc_label72.gridx = 3;
		gbc_label72.gridy = 8;
		panelBoard.add(label72, gbc_label72);

		label73 = new JLabel("");
		label73.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null,
				null, null));
		label73.setForeground(Color.WHITE);
		label73.setBackground(Color.WHITE);
		label73.setOpaque(true);
		GridBagConstraints gbc_label73 = new GridBagConstraints();
		gbc_label73.fill = GridBagConstraints.BOTH;
		gbc_label73.insets = new Insets(0, 0, 0, 5);
		gbc_label73.gridx = 4;
		gbc_label73.gridy = 8;
		panelBoard.add(label73, gbc_label73);

		label74 = new JLabel("");
		label74.setName("74");
		label74.setIcon(new ImageIcon(CheckersBoardClientGUI.class
				.getResource("/img/yellow.png")));
		label74.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				mouseClickedFunction(e);
			}
		});
		label74.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		label74.setForeground(Color.BLACK);
		label74.setOpaque(true);
		label74.setBackground(Color.BLACK);
		GridBagConstraints gbc_label74 = new GridBagConstraints();
		gbc_label74.fill = GridBagConstraints.BOTH;
		gbc_label74.insets = new Insets(0, 0, 0, 5);
		gbc_label74.gridx = 5;
		gbc_label74.gridy = 8;
		panelBoard.add(label74, gbc_label74);

		label75 = new JLabel("");
		label75.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null,
				null, null));
		label75.setForeground(Color.WHITE);
		label75.setBackground(Color.WHITE);
		label75.setOpaque(true);
		GridBagConstraints gbc_label75 = new GridBagConstraints();
		gbc_label75.fill = GridBagConstraints.BOTH;
		gbc_label75.insets = new Insets(0, 0, 0, 5);
		gbc_label75.gridx = 6;
		gbc_label75.gridy = 8;
		panelBoard.add(label75, gbc_label75);

		label76 = new JLabel("");
		label76.setName("76");
		label76.setIcon(new ImageIcon(CheckersBoardClientGUI.class
				.getResource("/img/yellow.png")));
		label76.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				mouseClickedFunction(e);
			}
		});
		label76.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		label76.setForeground(Color.BLACK);
		label76.setOpaque(true);
		label76.setBackground(Color.BLACK);
		GridBagConstraints gbc_label76 = new GridBagConstraints();
		gbc_label76.fill = GridBagConstraints.BOTH;
		gbc_label76.insets = new Insets(0, 0, 0, 5);
		gbc_label76.gridx = 7;
		gbc_label76.gridy = 8;
		panelBoard.add(label76, gbc_label76);

		label77 = new JLabel("");
		label77.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null,
				null, null));
		label77.setForeground(Color.WHITE);
		label77.setBackground(Color.WHITE);
		label77.setOpaque(true);
		GridBagConstraints gbc_label77 = new GridBagConstraints();
		gbc_label77.fill = GridBagConstraints.BOTH;
		gbc_label77.gridx = 8;
		gbc_label77.gridy = 8;
		panelBoard.add(label77, gbc_label77);

		panelHistory = new JPanel();
		panelHistory.setBorder(new TitledBorder(new LineBorder(new Color(0, 0,
				0), 3, true), "Game Status", TitledBorder.LEADING,
				TitledBorder.TOP, null, null));
		GridBagConstraints gbc_panelHistory = new GridBagConstraints();
		gbc_panelHistory.insets = new Insets(0, 0, 5, 0);
		gbc_panelHistory.fill = GridBagConstraints.BOTH;
		gbc_panelHistory.gridx = 1;
		gbc_panelHistory.gridy = 1;
		contentPane.add(panelHistory, gbc_panelHistory);
		GridBagLayout gbl_panelHistory = new GridBagLayout();
		gbl_panelHistory.columnWidths = new int[] { 0, 0 };
		gbl_panelHistory.rowHeights = new int[] { 0, 0 };
		gbl_panelHistory.columnWeights = new double[] { 1.0, Double.MIN_VALUE };
		gbl_panelHistory.rowWeights = new double[] { 1.0, Double.MIN_VALUE };
		panelHistory.setLayout(gbl_panelHistory);

		scrollPane = new JScrollPane();
		scrollPane
				.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 0;
		gbc_scrollPane.gridy = 0;
		panelHistory.add(scrollPane, gbc_scrollPane);

		history = new JTextArea();
		scrollPane.setViewportView(history);
		history.setFont(new Font("MS PGothic", Font.BOLD, 14));
		history.setForeground(Color.BLACK);
		history.setBackground(SystemColor.activeCaption);
		history.setLineWrap(true);

		panel = new JPanel();
		panel.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 3,
				true), "Server Status", TitledBorder.LEADING, TitledBorder.TOP,
				null, null));
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 1;
		gbc_panel.gridy = 2;
		contentPane.add(panel, gbc_panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[] { 0, 0 };
		gbl_panel.rowHeights = new int[] { 0, 0 };
		gbl_panel.columnWeights = new double[] { 1.0, Double.MIN_VALUE };
		gbl_panel.rowWeights = new double[] { 1.0, Double.MIN_VALUE };
		panel.setLayout(gbl_panel);

		scrollPane_1 = new JScrollPane();
		scrollPane_1
				.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		GridBagConstraints gbc_scrollPane_1 = new GridBagConstraints();
		gbc_scrollPane_1.fill = GridBagConstraints.BOTH;
		gbc_scrollPane_1.gridx = 0;
		gbc_scrollPane_1.gridy = 0;
		panel.add(scrollPane_1, gbc_scrollPane_1);

		serverStatus = new JTextArea();
		scrollPane_1.setViewportView(serverStatus);
		serverStatus.setForeground(new Color(0, 128, 0));
		serverStatus.setDisabledTextColor(new Color(0, 128, 0));
		serverStatus.setFont(new Font("Courier New", Font.BOLD, 14));
		serverStatus.setBackground(Color.BLACK);
		serverStatus.setLineWrap(true);
	}

	protected void actionPerformedJButtonLogin(ActionEvent e) {

		Object o = e.getSource();
		if (o == logout) {
			client.sendMessage(new Message(Message.STOP, ""));
			return;
		}
		
		if (connected) {
			client.sendMessage(new Message(Message.MESSAGE, "Connected."));
			return;
		}

		if (o == login) {
			String server = tfServer.getText().trim();
			if (server.length() == 0)
				return;
			String portNumber = tfPort.getText().trim();
			if (portNumber.length() == 0)
				return;
			int port = 0;
			try {
				port = Integer.parseInt(portNumber);
			} catch (Exception en) {
				return;
			}

			client = new Client(server, port, this);
			
			if (!client.start())
				return;
			connected = true;

			login.setEnabled(false);
			
			logout.setEnabled(true);
			
			tfServer.setEditable(false);
			tfPort.setEditable(false);
			appendGameStatus(">The game just started.\n");
			appendGameStatus(">It's the Server's turn.\n");
		}
	}

	private void updateBoard() {
		if (Board.getBoard(1, 2).getType() == Pawn.YELLOW
				&& !Board.getBoard(1, 2).isKing()) {
			label01.setIcon(ComponentImageFile.getImageIconYellow());
		} else if (Board.getBoard(1, 2).getType() == Pawn.GREY
				&& !Board.getBoard(1, 2).isKing()) {
			label01.setIcon(ComponentImageFile.getImageIconGrey());
		} else if (Board.getBoard(1, 2).getType() == Pawn.EMPTY) {
			label01.setIcon(ComponentImageFile.getImageIconBlack());
		} else if (Board.getBoard(1, 2).getType() == Pawn.YELLOW
				&& Board.getBoard(1, 2).isKing()) {
			label01.setIcon(ComponentImageFile.getImageIconYellowKing());
		} else if (Board.getBoard(1, 2).getType() == Pawn.GREY
				&& Board.getBoard(1, 2).isKing()) {
			label01.setIcon(ComponentImageFile.getImageIconGreyKing());
		}

		if (Board.getBoard(1, 4).getType() == Pawn.YELLOW
				&& !Board.getBoard(1, 4).isKing()) {
			label03.setIcon(ComponentImageFile.getImageIconYellow());
		} else if (Board.getBoard(1, 4).getType() == Pawn.GREY
				&& !Board.getBoard(1, 4).isKing()) {
			label03.setIcon(ComponentImageFile.getImageIconGrey());
		} else if (Board.getBoard(1, 4).getType() == Pawn.EMPTY) {
			label03.setIcon(ComponentImageFile.getImageIconBlack());
		} else if (Board.getBoard(1, 4).getType() == Pawn.YELLOW
				&& Board.getBoard(1, 4).isKing()) {
			label03.setIcon(ComponentImageFile.getImageIconYellowKing());
		} else if (Board.getBoard(1, 4).getType() == Pawn.GREY
				&& Board.getBoard(1, 4).isKing()) {
			label03.setIcon(ComponentImageFile.getImageIconGreyKing());
		}

		if (Board.getBoard(1, 6).getType() == Pawn.YELLOW
				&& !Board.getBoard(1, 6).isKing()) {
			label05.setIcon(ComponentImageFile.getImageIconYellow());
		} else if (Board.getBoard(1, 6).getType() == Pawn.GREY
				&& !Board.getBoard(1, 6).isKing()) {
			label05.setIcon(ComponentImageFile.getImageIconGrey());
		} else if (Board.getBoard(1, 6).getType() == Pawn.EMPTY) {
			label05.setIcon(ComponentImageFile.getImageIconBlack());
		} else if (Board.getBoard(1, 6).getType() == Pawn.YELLOW
				&& Board.getBoard(1, 6).isKing()) {
			label05.setIcon(ComponentImageFile.getImageIconYellowKing());
		} else if (Board.getBoard(1, 6).getType() == Pawn.GREY
				&& Board.getBoard(1, 6).isKing()) {
			label05.setIcon(ComponentImageFile.getImageIconGreyKing());
		}

		if (Board.getBoard(1, 8).getType() == Pawn.YELLOW
				&& !Board.getBoard(1, 8).isKing()) {
			label07.setIcon(ComponentImageFile.getImageIconYellow());
		} else if (Board.getBoard(1, 8).getType() == Pawn.GREY
				&& !Board.getBoard(1, 8).isKing()) {
			label07.setIcon(ComponentImageFile.getImageIconGrey());
		} else if (Board.getBoard(1, 8).getType() == Pawn.EMPTY) {
			label07.setIcon(ComponentImageFile.getImageIconBlack());
		} else if (Board.getBoard(1, 8).getType() == Pawn.YELLOW
				&& Board.getBoard(1, 8).isKing()) {
			label07.setIcon(ComponentImageFile.getImageIconYellowKing());
		} else if (Board.getBoard(1, 8).getType() == Pawn.GREY
				&& Board.getBoard(1, 8).isKing()) {
			label07.setIcon(ComponentImageFile.getImageIconGreyKing());
		}

		if (Board.getBoard(2, 1).getType() == Pawn.YELLOW
				&& !Board.getBoard(2, 1).isKing()) {
			label10.setIcon(ComponentImageFile.getImageIconYellow());
		} else if (Board.getBoard(2, 1).getType() == Pawn.GREY
				&& !Board.getBoard(2, 1).isKing()) {
			label10.setIcon(ComponentImageFile.getImageIconGrey());
		} else if (Board.getBoard(2, 1).getType() == Pawn.EMPTY) {
			label10.setIcon(ComponentImageFile.getImageIconBlack());
		} else if (Board.getBoard(2, 1).getType() == Pawn.YELLOW
				&& Board.getBoard(2, 1).isKing()) {
			label10.setIcon(ComponentImageFile.getImageIconYellowKing());
		} else if (Board.getBoard(2, 1).getType() == Pawn.GREY
				&& Board.getBoard(2, 1).isKing()) {
			label10.setIcon(ComponentImageFile.getImageIconGreyKing());
		}

		if (Board.getBoard(2, 3).getType() == Pawn.YELLOW
				&& !Board.getBoard(2, 3).isKing()) {
			label12.setIcon(ComponentImageFile.getImageIconYellow());
		} else if (Board.getBoard(2, 3).getType() == Pawn.GREY
				&& !Board.getBoard(2, 3).isKing()) {
			label12.setIcon(ComponentImageFile.getImageIconGrey());
		} else if (Board.getBoard(2, 3).getType() == Pawn.EMPTY) {
			label12.setIcon(ComponentImageFile.getImageIconBlack());
		} else if (Board.getBoard(2, 3).getType() == Pawn.YELLOW
				&& Board.getBoard(2, 3).isKing()) {
			label12.setIcon(ComponentImageFile.getImageIconYellowKing());
		} else if (Board.getBoard(2, 3).getType() == Pawn.GREY
				&& Board.getBoard(2, 3).isKing()) {
			label12.setIcon(ComponentImageFile.getImageIconGreyKing());
		}

		if (Board.getBoard(2, 5).getType() == Pawn.YELLOW
				&& !Board.getBoard(2, 5).isKing()) {
			label14.setIcon(ComponentImageFile.getImageIconYellow());
		} else if (Board.getBoard(2, 5).getType() == Pawn.GREY
				&& !Board.getBoard(2, 5).isKing()) {
			label14.setIcon(ComponentImageFile.getImageIconGrey());
		} else if (Board.getBoard(2, 5).getType() == Pawn.EMPTY) {
			label14.setIcon(ComponentImageFile.getImageIconBlack());
		} else if (Board.getBoard(2, 5).getType() == Pawn.YELLOW
				&& Board.getBoard(2, 5).isKing()) {
			label14.setIcon(ComponentImageFile.getImageIconYellowKing());
		} else if (Board.getBoard(2, 5).getType() == Pawn.GREY
				&& Board.getBoard(2, 5).isKing()) {
			label14.setIcon(ComponentImageFile.getImageIconGreyKing());
		}

		if (Board.getBoard(2, 7).getType() == Pawn.YELLOW
				&& !Board.getBoard(2, 7).isKing()) {
			label16.setIcon(ComponentImageFile.getImageIconYellow());
		} else if (Board.getBoard(2, 7).getType() == Pawn.GREY
				&& !Board.getBoard(2, 7).isKing()) {
			label16.setIcon(ComponentImageFile.getImageIconGrey());
		} else if (Board.getBoard(2, 7).getType() == Pawn.EMPTY) {
			label16.setIcon(ComponentImageFile.getImageIconBlack());
		} else if (Board.getBoard(2, 7).getType() == Pawn.YELLOW
				&& Board.getBoard(2, 7).isKing()) {
			label16.setIcon(ComponentImageFile.getImageIconYellowKing());
		} else if (Board.getBoard(2, 7).getType() == Pawn.GREY
				&& Board.getBoard(2, 7).isKing()) {
			label16.setIcon(ComponentImageFile.getImageIconGreyKing());
		}

		if (Board.getBoard(3, 2).getType() == Pawn.YELLOW
				&& !Board.getBoard(3, 2).isKing()) {
			label21.setIcon(ComponentImageFile.getImageIconYellow());
		} else if (Board.getBoard(3, 2).getType() == Pawn.GREY
				&& !Board.getBoard(3, 2).isKing()) {
			label21.setIcon(ComponentImageFile.getImageIconGrey());
		} else if (Board.getBoard(3, 2).getType() == Pawn.EMPTY) {
			label21.setIcon(ComponentImageFile.getImageIconBlack());
		} else if (Board.getBoard(3, 2).getType() == Pawn.YELLOW
				&& Board.getBoard(3, 2).isKing()) {
			label21.setIcon(ComponentImageFile.getImageIconYellowKing());
		} else if (Board.getBoard(3, 2).getType() == Pawn.GREY
				&& Board.getBoard(3, 2).isKing()) {
			label21.setIcon(ComponentImageFile.getImageIconGreyKing());
		}

		if (Board.getBoard(3, 4).getType() == Pawn.YELLOW
				&& !Board.getBoard(3, 4).isKing()) {
			label23.setIcon(ComponentImageFile.getImageIconYellow());
		} else if (Board.getBoard(3, 4).getType() == Pawn.GREY
				&& !Board.getBoard(3, 4).isKing()) {
			label23.setIcon(ComponentImageFile.getImageIconGrey());
		} else if (Board.getBoard(3, 4).getType() == Pawn.EMPTY) {
			label23.setIcon(ComponentImageFile.getImageIconBlack());
		} else if (Board.getBoard(3, 4).getType() == Pawn.YELLOW
				&& Board.getBoard(3, 4).isKing()) {
			label23.setIcon(ComponentImageFile.getImageIconYellowKing());
		} else if (Board.getBoard(3, 4).getType() == Pawn.GREY
				&& Board.getBoard(3, 4).isKing()) {
			label23.setIcon(ComponentImageFile.getImageIconGreyKing());
		}

		if (Board.getBoard(3, 6).getType() == Pawn.YELLOW
				&& !Board.getBoard(3, 6).isKing()) {
			label25.setIcon(ComponentImageFile.getImageIconYellow());
		} else if (Board.getBoard(3, 6).getType() == Pawn.GREY
				&& !Board.getBoard(3, 6).isKing()) {
			label25.setIcon(ComponentImageFile.getImageIconGrey());
		} else if (Board.getBoard(3, 6).getType() == Pawn.EMPTY) {
			label25.setIcon(ComponentImageFile.getImageIconBlack());
		} else if (Board.getBoard(3, 6).getType() == Pawn.YELLOW
				&& Board.getBoard(3, 6).isKing()) {
			label25.setIcon(ComponentImageFile.getImageIconYellowKing());
		} else if (Board.getBoard(3, 6).getType() == Pawn.GREY
				&& Board.getBoard(3, 6).isKing()) {
			label25.setIcon(ComponentImageFile.getImageIconGreyKing());
		}

		if (Board.getBoard(3, 8).getType() == Pawn.YELLOW
				&& !Board.getBoard(3, 8).isKing()) {
			label27.setIcon(ComponentImageFile.getImageIconYellow());
		} else if (Board.getBoard(3, 8).getType() == Pawn.GREY
				&& !Board.getBoard(3, 8).isKing()) {
			label27.setIcon(ComponentImageFile.getImageIconGrey());
		} else if (Board.getBoard(3, 8).getType() == Pawn.EMPTY) {
			label27.setIcon(ComponentImageFile.getImageIconBlack());
		} else if (Board.getBoard(3, 8).getType() == Pawn.YELLOW
				&& Board.getBoard(3, 8).isKing()) {
			label27.setIcon(ComponentImageFile.getImageIconYellowKing());
		} else if (Board.getBoard(3, 8).getType() == Pawn.GREY
				&& Board.getBoard(3, 8).isKing()) {
			label27.setIcon(ComponentImageFile.getImageIconGreyKing());
		}

		if (Board.getBoard(4, 1).getType() == Pawn.YELLOW
				&& !Board.getBoard(4, 1).isKing()) {
			label30.setIcon(ComponentImageFile.getImageIconYellow());
		} else if (Board.getBoard(4, 1).getType() == Pawn.GREY
				&& !Board.getBoard(4, 1).isKing()) {
			label30.setIcon(ComponentImageFile.getImageIconGrey());
		} else if (Board.getBoard(4, 1).getType() == Pawn.EMPTY) {
			label30.setIcon(ComponentImageFile.getImageIconBlack());
		} else if (Board.getBoard(4, 1).getType() == Pawn.YELLOW
				&& Board.getBoard(4, 1).isKing()) {
			label30.setIcon(ComponentImageFile.getImageIconYellowKing());
		} else if (Board.getBoard(4, 1).getType() == Pawn.GREY
				&& Board.getBoard(4, 1).isKing()) {
			label30.setIcon(ComponentImageFile.getImageIconGreyKing());
		}

		if (Board.getBoard(4, 3).getType() == Pawn.YELLOW
				&& !Board.getBoard(4, 3).isKing()) {
			label32.setIcon(ComponentImageFile.getImageIconYellow());
		} else if (Board.getBoard(4, 3).getType() == Pawn.GREY
				&& !Board.getBoard(4, 3).isKing()) {
			label32.setIcon(ComponentImageFile.getImageIconGrey());
		} else if (Board.getBoard(4, 3).getType() == Pawn.EMPTY) {
			label32.setIcon(ComponentImageFile.getImageIconBlack());
		} else if (Board.getBoard(4, 3).getType() == Pawn.YELLOW
				&& Board.getBoard(4, 3).isKing()) {
			label32.setIcon(ComponentImageFile.getImageIconYellowKing());
		} else if (Board.getBoard(4, 3).getType() == Pawn.GREY
				&& Board.getBoard(4, 3).isKing()) {
			label32.setIcon(ComponentImageFile.getImageIconGreyKing());
		}

		if (Board.getBoard(4, 5).getType() == Pawn.YELLOW
				&& !Board.getBoard(4, 5).isKing()) {
			label34.setIcon(ComponentImageFile.getImageIconYellow());
		} else if (Board.getBoard(4, 5).getType() == Pawn.GREY
				&& !Board.getBoard(4, 5).isKing()) {
			label34.setIcon(ComponentImageFile.getImageIconGrey());
		} else if (Board.getBoard(4, 5).getType() == Pawn.EMPTY) {
			label34.setIcon(ComponentImageFile.getImageIconBlack());
		} else if (Board.getBoard(4, 5).getType() == Pawn.YELLOW
				&& Board.getBoard(4, 5).isKing()) {
			label34.setIcon(ComponentImageFile.getImageIconYellowKing());
		} else if (Board.getBoard(4, 5).getType() == Pawn.GREY
				&& Board.getBoard(4, 5).isKing()) {
			label34.setIcon(ComponentImageFile.getImageIconGreyKing());
		}

		if (Board.getBoard(4, 7).getType() == Pawn.YELLOW
				&& !Board.getBoard(4, 7).isKing()) {
			label36.setIcon(ComponentImageFile.getImageIconYellow());
		} else if (Board.getBoard(4, 7).getType() == Pawn.GREY
				&& !Board.getBoard(4, 7).isKing()) {
			label36.setIcon(ComponentImageFile.getImageIconGrey());
		} else if (Board.getBoard(4, 7).getType() == Pawn.EMPTY) {
			label36.setIcon(ComponentImageFile.getImageIconBlack());
		} else if (Board.getBoard(4, 7).getType() == Pawn.YELLOW
				&& Board.getBoard(4, 7).isKing()) {
			label36.setIcon(ComponentImageFile.getImageIconYellowKing());
		} else if (Board.getBoard(4, 7).getType() == Pawn.GREY
				&& Board.getBoard(4, 7).isKing()) {
			label36.setIcon(ComponentImageFile.getImageIconGreyKing());
		}

		if (Board.getBoard(5, 2).getType() == Pawn.YELLOW
				&& !Board.getBoard(5, 2).isKing()) {
			label41.setIcon(ComponentImageFile.getImageIconYellow());
		} else if (Board.getBoard(5, 2).getType() == Pawn.GREY
				&& !Board.getBoard(5, 2).isKing()) {
			label41.setIcon(ComponentImageFile.getImageIconGrey());
		} else if (Board.getBoard(5, 2).getType() == Pawn.EMPTY) {
			label41.setIcon(ComponentImageFile.getImageIconBlack());
		} else if (Board.getBoard(5, 2).getType() == Pawn.YELLOW
				&& Board.getBoard(5, 2).isKing()) {
			label41.setIcon(ComponentImageFile.getImageIconYellowKing());
		} else if (Board.getBoard(5, 2).getType() == Pawn.GREY
				&& Board.getBoard(5, 2).isKing()) {
			label41.setIcon(ComponentImageFile.getImageIconGreyKing());
		}

		if (Board.getBoard(5, 4).getType() == Pawn.YELLOW
				&& !Board.getBoard(5, 4).isKing()) {
			label43.setIcon(ComponentImageFile.getImageIconYellow());
		} else if (Board.getBoard(5, 4).getType() == Pawn.GREY
				&& !Board.getBoard(5, 4).isKing()) {
			label43.setIcon(ComponentImageFile.getImageIconGrey());
		} else if (Board.getBoard(5, 4).getType() == Pawn.EMPTY) {
			label43.setIcon(ComponentImageFile.getImageIconBlack());
		} else if (Board.getBoard(5, 4).getType() == Pawn.YELLOW
				&& Board.getBoard(5, 4).isKing()) {
			label43.setIcon(ComponentImageFile.getImageIconYellowKing());
		} else if (Board.getBoard(5, 4).getType() == Pawn.GREY
				&& Board.getBoard(5, 4).isKing()) {
			label43.setIcon(ComponentImageFile.getImageIconGreyKing());
		}

		if (Board.getBoard(5, 6).getType() == Pawn.YELLOW
				&& !Board.getBoard(5, 6).isKing()) {
			label45.setIcon(ComponentImageFile.getImageIconYellow());
		} else if (Board.getBoard(5, 6).getType() == Pawn.GREY
				&& !Board.getBoard(5, 6).isKing()) {
			label45.setIcon(ComponentImageFile.getImageIconGrey());
		} else if (Board.getBoard(5, 6).getType() == Pawn.EMPTY) {
			label45.setIcon(ComponentImageFile.getImageIconBlack());
		} else if (Board.getBoard(5, 6).getType() == Pawn.YELLOW
				&& Board.getBoard(5, 6).isKing()) {
			label45.setIcon(ComponentImageFile.getImageIconYellowKing());
		} else if (Board.getBoard(5, 6).getType() == Pawn.GREY
				&& Board.getBoard(5, 6).isKing()) {
			label45.setIcon(ComponentImageFile.getImageIconGreyKing());
		}

		if (Board.getBoard(5, 8).getType() == Pawn.YELLOW
				&& !Board.getBoard(5, 8).isKing()) {
			label47.setIcon(ComponentImageFile.getImageIconYellow());
		} else if (Board.getBoard(5, 8).getType() == Pawn.GREY
				&& !Board.getBoard(5, 8).isKing()) {
			label47.setIcon(ComponentImageFile.getImageIconGrey());
		} else if (Board.getBoard(5, 8).getType() == Pawn.EMPTY) {
			label47.setIcon(ComponentImageFile.getImageIconBlack());
		} else if (Board.getBoard(5, 8).getType() == Pawn.YELLOW
				&& Board.getBoard(5, 8).isKing()) {
			label47.setIcon(ComponentImageFile.getImageIconYellowKing());
		} else if (Board.getBoard(5, 8).getType() == Pawn.GREY
				&& Board.getBoard(5, 8).isKing()) {
			label47.setIcon(ComponentImageFile.getImageIconGreyKing());
		}

		if (Board.getBoard(6, 1).getType() == Pawn.YELLOW
				&& !Board.getBoard(6, 1).isKing()) {
			label50.setIcon(ComponentImageFile.getImageIconYellow());
		} else if (Board.getBoard(6, 1).getType() == Pawn.GREY
				&& !Board.getBoard(6, 1).isKing()) {
			label50.setIcon(ComponentImageFile.getImageIconGrey());
		} else if (Board.getBoard(6, 1).getType() == Pawn.EMPTY) {
			label50.setIcon(ComponentImageFile.getImageIconBlack());
		} else if (Board.getBoard(6, 1).getType() == Pawn.YELLOW
				&& Board.getBoard(6, 1).isKing()) {
			label50.setIcon(ComponentImageFile.getImageIconYellowKing());
		} else if (Board.getBoard(6, 1).getType() == Pawn.GREY
				&& Board.getBoard(6, 1).isKing()) {
			label50.setIcon(ComponentImageFile.getImageIconGreyKing());
		}

		if (Board.getBoard(6, 3).getType() == Pawn.YELLOW
				&& !Board.getBoard(6, 3).isKing()) {
			label52.setIcon(ComponentImageFile.getImageIconYellow());
		} else if (Board.getBoard(6, 3).getType() == Pawn.GREY
				&& !Board.getBoard(6, 3).isKing()) {
			label52.setIcon(ComponentImageFile.getImageIconGrey());
		} else if (Board.getBoard(6, 3).getType() == Pawn.EMPTY) {
			label52.setIcon(ComponentImageFile.getImageIconBlack());
		} else if (Board.getBoard(6, 3).getType() == Pawn.YELLOW
				&& Board.getBoard(6, 3).isKing()) {
			label52.setIcon(ComponentImageFile.getImageIconYellowKing());
		} else if (Board.getBoard(6, 3).getType() == Pawn.GREY
				&& Board.getBoard(6, 3).isKing()) {
			label52.setIcon(ComponentImageFile.getImageIconGreyKing());
		}

		if (Board.getBoard(6, 5).getType() == Pawn.YELLOW
				&& !Board.getBoard(6, 5).isKing()) {
			label54.setIcon(ComponentImageFile.getImageIconYellow());
		} else if (Board.getBoard(6, 5).getType() == Pawn.GREY
				&& !Board.getBoard(6, 5).isKing()) {
			label54.setIcon(ComponentImageFile.getImageIconGrey());
		} else if (Board.getBoard(6, 5).getType() == Pawn.EMPTY) {
			label54.setIcon(ComponentImageFile.getImageIconBlack());
		} else if (Board.getBoard(6, 5).getType() == Pawn.YELLOW
				&& Board.getBoard(6, 5).isKing()) {
			label54.setIcon(ComponentImageFile.getImageIconYellowKing());
		} else if (Board.getBoard(6, 5).getType() == Pawn.GREY
				&& Board.getBoard(6, 5).isKing()) {
			label54.setIcon(ComponentImageFile.getImageIconGreyKing());
		}

		if (Board.getBoard(6, 7).getType() == Pawn.YELLOW
				&& !Board.getBoard(6, 7).isKing()) {
			label56.setIcon(ComponentImageFile.getImageIconYellow());
		} else if (Board.getBoard(6, 7).getType() == Pawn.GREY
				&& !Board.getBoard(6, 7).isKing()) {
			label56.setIcon(ComponentImageFile.getImageIconGrey());
		} else if (Board.getBoard(6, 7).getType() == Pawn.EMPTY) {
			label56.setIcon(ComponentImageFile.getImageIconBlack());
		} else if (Board.getBoard(6, 7).getType() == Pawn.YELLOW
				&& Board.getBoard(6, 7).isKing()) {
			label56.setIcon(ComponentImageFile.getImageIconYellowKing());
		} else if (Board.getBoard(6, 7).getType() == Pawn.GREY
				&& Board.getBoard(6, 7).isKing()) {
			label56.setIcon(ComponentImageFile.getImageIconGreyKing());
		}

		if (Board.getBoard(7, 2).getType() == Pawn.YELLOW
				&& !Board.getBoard(7, 2).isKing()) {
			label61.setIcon(ComponentImageFile.getImageIconYellow());
		} else if (Board.getBoard(7, 2).getType() == Pawn.GREY
				&& !Board.getBoard(7, 2).isKing()) {
			label61.setIcon(ComponentImageFile.getImageIconGrey());
		} else if (Board.getBoard(7, 2).getType() == Pawn.EMPTY) {
			label61.setIcon(ComponentImageFile.getImageIconBlack());
		} else if (Board.getBoard(7, 2).getType() == Pawn.YELLOW
				&& Board.getBoard(7, 2).isKing()) {
			label61.setIcon(ComponentImageFile.getImageIconYellowKing());
		} else if (Board.getBoard(7, 2).getType() == Pawn.GREY
				&& Board.getBoard(7, 2).isKing()) {
			label61.setIcon(ComponentImageFile.getImageIconGreyKing());
		}

		if (Board.getBoard(7, 4).getType() == Pawn.YELLOW
				&& !Board.getBoard(7, 4).isKing()) {
			label63.setIcon(ComponentImageFile.getImageIconYellow());
		} else if (Board.getBoard(7, 4).getType() == Pawn.GREY
				&& !Board.getBoard(7, 4).isKing()) {
			label63.setIcon(ComponentImageFile.getImageIconGrey());
		} else if (Board.getBoard(7, 4).getType() == Pawn.EMPTY) {
			label63.setIcon(ComponentImageFile.getImageIconBlack());
		} else if (Board.getBoard(7, 4).getType() == Pawn.YELLOW
				&& Board.getBoard(7, 4).isKing()) {
			label63.setIcon(ComponentImageFile.getImageIconYellowKing());
		} else if (Board.getBoard(7, 4).getType() == Pawn.GREY
				&& Board.getBoard(7, 4).isKing()) {
			label63.setIcon(ComponentImageFile.getImageIconGreyKing());
		}

		if (Board.getBoard(7, 6).getType() == Pawn.YELLOW
				&& !Board.getBoard(7, 6).isKing()) {
			label65.setIcon(ComponentImageFile.getImageIconYellow());
		} else if (Board.getBoard(7, 6).getType() == Pawn.GREY
				&& !Board.getBoard(7, 6).isKing()) {
			label65.setIcon(ComponentImageFile.getImageIconGrey());
		} else if (Board.getBoard(7, 6).getType() == Pawn.EMPTY) {
			label65.setIcon(ComponentImageFile.getImageIconBlack());
		} else if (Board.getBoard(7, 6).getType() == Pawn.YELLOW
				&& Board.getBoard(7, 6).isKing()) {
			label65.setIcon(ComponentImageFile.getImageIconYellowKing());
		} else if (Board.getBoard(7, 6).getType() == Pawn.GREY
				&& Board.getBoard(7, 6).isKing()) {
			label65.setIcon(ComponentImageFile.getImageIconGreyKing());
		}

		if (Board.getBoard(7, 8).getType() == Pawn.YELLOW
				&& !Board.getBoard(7, 8).isKing()) {
			label67.setIcon(ComponentImageFile.getImageIconYellow());
		} else if (Board.getBoard(7, 8).getType() == Pawn.GREY
				&& !Board.getBoard(7, 8).isKing()) {
			label67.setIcon(ComponentImageFile.getImageIconGrey());
		} else if (Board.getBoard(7, 8).getType() == Pawn.EMPTY) {
			label67.setIcon(ComponentImageFile.getImageIconBlack());
		} else if (Board.getBoard(7, 8).getType() == Pawn.YELLOW
				&& Board.getBoard(7, 8).isKing()) {
			label67.setIcon(ComponentImageFile.getImageIconYellowKing());
		} else if (Board.getBoard(7, 8).getType() == Pawn.GREY
				&& Board.getBoard(7, 8).isKing()) {
			label67.setIcon(ComponentImageFile.getImageIconGreyKing());
		}

		if (Board.getBoard(8, 1).getType() == Pawn.YELLOW
				&& !Board.getBoard(8, 1).isKing()) {
			label70.setIcon(ComponentImageFile.getImageIconYellow());
		} else if (Board.getBoard(8, 1).getType() == Pawn.GREY
				&& !Board.getBoard(8, 1).isKing()) {
			label70.setIcon(ComponentImageFile.getImageIconGrey());
		} else if (Board.getBoard(8, 1).getType() == Pawn.EMPTY) {
			label70.setIcon(ComponentImageFile.getImageIconBlack());
		} else if (Board.getBoard(8, 1).getType() == Pawn.YELLOW
				&& Board.getBoard(8, 1).isKing()) {
			label70.setIcon(ComponentImageFile.getImageIconYellowKing());
		} else if (Board.getBoard(8, 1).getType() == Pawn.GREY
				&& Board.getBoard(8, 1).isKing()) {
			label70.setIcon(ComponentImageFile.getImageIconGreyKing());
		}

		if (Board.getBoard(8, 3).getType() == Pawn.YELLOW
				&& !Board.getBoard(8, 3).isKing()) {
			label72.setIcon(ComponentImageFile.getImageIconYellow());
		} else if (Board.getBoard(8, 3).getType() == Pawn.GREY
				&& !Board.getBoard(8, 3).isKing()) {
			label72.setIcon(ComponentImageFile.getImageIconGrey());
		} else if (Board.getBoard(8, 3).getType() == Pawn.EMPTY) {
			label72.setIcon(ComponentImageFile.getImageIconBlack());
		} else if (Board.getBoard(8, 3).getType() == Pawn.YELLOW
				&& Board.getBoard(8, 3).isKing()) {
			label72.setIcon(ComponentImageFile.getImageIconYellowKing());
		} else if (Board.getBoard(8, 3).getType() == Pawn.GREY
				&& Board.getBoard(8, 3).isKing()) {
			label72.setIcon(ComponentImageFile.getImageIconGreyKing());
		}

		if (Board.getBoard(8, 5).getType() == Pawn.YELLOW
				&& !Board.getBoard(8, 5).isKing()) {
			label74.setIcon(ComponentImageFile.getImageIconYellow());
		} else if (Board.getBoard(8, 5).getType() == Pawn.GREY
				&& !Board.getBoard(8, 5).isKing()) {
			label74.setIcon(ComponentImageFile.getImageIconGrey());
		} else if (Board.getBoard(8, 5).getType() == Pawn.EMPTY) {
			label74.setIcon(ComponentImageFile.getImageIconBlack());
		} else if (Board.getBoard(8, 5).getType() == Pawn.YELLOW
				&& Board.getBoard(8, 5).isKing()) {
			label74.setIcon(ComponentImageFile.getImageIconYellowKing());
		} else if (Board.getBoard(8, 5).getType() == Pawn.GREY
				&& Board.getBoard(8, 5).isKing()) {
			label74.setIcon(ComponentImageFile.getImageIconGreyKing());
		}

		if (Board.getBoard(8, 7).getType() == Pawn.YELLOW
				&& !Board.getBoard(8, 7).isKing()) {
			label76.setIcon(ComponentImageFile.getImageIconYellow());
		} else if (Board.getBoard(8, 7).getType() == Pawn.GREY
				&& !Board.getBoard(8, 7).isKing()) {
			label76.setIcon(ComponentImageFile.getImageIconGrey());
		} else if (Board.getBoard(8, 7).getType() == Pawn.EMPTY) {
			label76.setIcon(ComponentImageFile.getImageIconBlack());
		} else if (Board.getBoard(8, 7).getType() == Pawn.YELLOW
				&& Board.getBoard(8, 7).isKing()) {
			label76.setIcon(ComponentImageFile.getImageIconYellowKing());
		} else if (Board.getBoard(8, 7).getType() == Pawn.GREY
				&& Board.getBoard(8, 7).isKing()) {
			label76.setIcon(ComponentImageFile.getImageIconGreyKing());
		}
		repaint();
	}

	protected void mouseClickedFunction(MouseEvent e) {
		if (e.getClickCount() == 1) {
			if (action && board.getWhoisplaying() == Pawn.YELLOW) {
				int oldRow = Integer.parseInt(Character
						.toString(componentBefore.getName().charAt(0))) + 1;
				int oldColumn = Integer.parseInt(Character
						.toString(componentBefore.getName().charAt(1))) + 1;
				int newRow = Integer.parseInt(Character
						.toString(((JComponent) e.getComponent()).getName()
								.charAt(0))) + 1;
				int newColumn = Integer.parseInt(Character
						.toString(((JComponent) e.getComponent()).getName()
								.charAt(1))) + 1;

				if (board.getBoard(newRow, newColumn).getType() == Pawn.EMPTY && board.takingTheJump(oldRow, oldColumn, newRow, newColumn)){
						Board.Move(oldRow, oldColumn, newRow, newColumn);
						String oldPosition = Integer.toString(oldRow) + ","
								+ Integer.toString(oldColumn);
						String newPosition = Integer.toString(newRow) + ","
								+ Integer.toString(newColumn);
						
						if(!board.eatMore(newRow, newColumn)){
							appendGameStatus(">You moved from (" + oldPosition
									+ ") to (" + newPosition + ").\n");
							appendGameStatus(">It's the Server's turn.\n\n");
						} 
						
							board.mustTakeTheJump = false;
						
						client.sendMessage(new Message(
								Message.SIMPLE_MESSAGE,
								"Client moved from (" + oldPosition + ") to ("
										+ newPosition + ")."));
						componentBefore.setBorder(new LineBorder(new Color(0,
								0, 0), 2));
						componentBefore.repaint();
						action = false;
						updateBoard();
				} else {
					if(board.mustTakeTheJump){
						JOptionPane.showMessageDialog(null,
								"You must take the jump.");
					} else JOptionPane.showMessageDialog(null, "Wrong move.");
					componentBefore.setBorder(new LineBorder(new Color(
							0, 0, 0), 2));
					componentBefore.repaint();
					action = false;
				}
			} else {
				int x = Integer.parseInt(Character.toString(((JComponent) e
						.getComponent()).getName().charAt(0))) + 1;
				int y = Integer.parseInt(Character.toString(((JComponent) e
						.getComponent()).getName().charAt(1))) + 1;
				if (board.getWhoisplaying() == Pawn.YELLOW
						&& board.getBoard(x, y).getType() == Pawn.YELLOW) {
					action = true;
					((JComponent) e.getComponent()).setBorder(new LineBorder(
							Color.RED, 2));
					((JComponent) e.getComponent()).repaint();
					componentBefore = ((JComponent) e.getComponent());
				}
			}

		}

	}

	public void appendEvent(String str) {
		serverStatus.append(str + "\n");
		serverStatus.setCaretPosition(history.getText().length());
	}

	public void appendGameStatus(String str) {
		history.append(str + "\n");
		history.setCaretPosition(history.getText().length());
	}

	public void connectionFailed() {
		login.setEnabled(true);
		logout.setEnabled(false);
		// reset port number and host name as a construction time
		tfPort.setText("" + defaultPort);
		tfServer.setText(defaultHost);
		// let the user change them
		tfServer.setEditable(false);
		tfPort.setEditable(false);
		// don't react to a <CR> after the username

		connected = false;
	}

	public static void main(String[] args) {
		new CheckersBoardClientGUI("localhost", 4444).setVisible(true);
	}

	public void movimenta(String message) {
		String oldRow = message.substring(19, 20);
		String oldColumn = message.substring(21, 22);
		String newRow = message.substring(28, 29);
		String newColumn = message.substring(30, 31);

		int xo = Integer.parseInt(oldRow);
		int yo = Integer.parseInt(oldColumn);
		int xd = Integer.parseInt(newRow);
		int yd = Integer.parseInt(newColumn);

		if (board.getBoard(xd, yd).getType() == Pawn.EMPTY) {
			Board.Move(xo, yo, xd, yd);
		}
		updateBoard();
		repaint();
		validate();
		revalidate();
	}

}
