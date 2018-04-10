package SondeDemo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import SondeDemo.Communicator;

import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import java.util.Date;
import java.util.Calendar;
import javax.swing.SpinnerNumberModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTabbedPane;
import javax.swing.JFormattedTextField;

public class GUI extends JFrame {

	private JPanel contentPane;
	public JButton btnConnect;
    public JButton btnDisconnect;
    public JComboBox cboxPorts;
    public JComboBox cmbMode;
    public JButton btnConfirm;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JTextArea jTextArea1;
    public javax.swing.JTextArea txtLog;
	Communicator communicator = null;
	private JPanel panel_2;
	private JTabbedPane tabbedPane;
	private JSpinner spinner_1;
	private JLabel label_2;
	private JLabel label_3;
	private JSpinner spinner_2;
	private JLabel label_4;
	private JSpinner spinner_3;
	private JLabel label_5;
	private JSpinner spinner_4;
	private JLabel label_6;
	private JSpinner spinner_5;
	private JSpinner spinner_6;
	private JLabel label_8;
	private JLabel label_9;
	private JSpinner spinner_7;
	private JLabel label_10;
	private JSpinner spinner_8;
	private JLabel label_11;
	private JSpinner spinner_9;
	private JLabel label_12;
	private JSpinner spinner_10;
	private JLabel label_13;
	private JSpinner spinner_11;
	private JLabel label_14;
	private JLabel label_15;
	private JSpinner spinner_12;
	private JLabel label_16;
	private JSpinner spinner_13;
	private JLabel label_17;
	private JSpinner spinner_14;
	private JLabel label_18;
	private JSpinner spinner_15;
	private JLabel label_19;
	private JSpinner spinner_16;
	private JLabel label_20;
	private JLabel label_21;
	private JSpinner spinner_17;
	private JLabel label_22;
	private JSpinner spinner_18;
	private JLabel label_23;
	private JSpinner spinner_19;
	private JLabel label_24;
	private JSpinner spinner_20;
	private JLabel label_25;
	private JSpinner spinner_21;
	private JLabel label_26;
	private JLabel label_27;
	private JSpinner spinner_22;
	private JLabel label_28;
	private JSpinner spinner_23;
	private JLabel label_29;
	private JSpinner spinner_24;
	
	public GUI() {
		setResizable(false);
		setTitle("Duro Sonde");
        initComponents();
        createObjects();
        communicator.searchForPorts();
        //keybindingController.toggleControls();
        //keybindingController.bindKeys();
    }

    private void createObjects()
    {
    	 communicator = new Communicator(this);
        //keybindingController = new KeybindingController(this);
    }

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI frame = new GUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public void initComponents() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 447, 600);
		contentPane = new JPanel();
		contentPane.setToolTipText("Sonde");
		contentPane.setBorder(new EmptyBorder(1, 1, 1, 1));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 442, 80);
		contentPane.add(panel);
		panel.setLayout(null);
		
		cboxPorts = new JComboBox();
		cboxPorts.setBounds(92, 36, 72, 21);
		panel.add(cboxPorts);
		
		btnConnect = new JButton("Connect");
		btnConnect.setBounds(203, 35, 93, 23);
		panel.add(btnConnect);
		
		btnDisconnect = new JButton("Disconnect");
		btnDisconnect.setBounds(322, 35, 102, 23);
		panel.add(btnDisconnect);
		
		JLabel lblSelectPort = new JLabel("Select Port");
		lblSelectPort.setBounds(10, 39, 73, 15);
		panel.add(lblSelectPort);
		
		jScrollPane = new JScrollPane();
		jScrollPane.setBounds(0, 434, 444, 128);
		contentPane.add(jScrollPane);
		
		txtLog = new JTextArea();
		txtLog.setColumns(20);
        txtLog.setEditable(false);
        txtLog.setLineWrap(true);
        txtLog.setRows(5);
        txtLog.setFocusable(false);
		jScrollPane.setViewportView(txtLog);
		
		panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(192, 192, 192)));
		panel_2.setBounds(0, 174, 442, 190);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 442, 190);
		panel_2.add(tabbedPane);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("PH", null, panel_3, null);
		panel_3.setLayout(null);
		
		label_6 = new JLabel("Start");
		label_6.setBounds(10, 10, 30, 15);
		panel_3.add(label_6);
		
		JLabel lblEndTime = new JLabel("End");
		lblEndTime.setBounds(10, 35, 54, 15);
		panel_3.add(lblEndTime);
		
		spinner_5 = new JSpinner();
		spinner_5.setBounds(59, 7, 133, 22);
		panel_3.add(spinner_5);
		
		spinner_6 = new JSpinner();
		spinner_6.setBounds(59, 32, 133, 22);
		panel_3.add(spinner_6);
		
		label_8 = new JLabel("Repeats");
		label_8.setBounds(10, 66, 54, 15);
		panel_3.add(label_8);
		
		label_9 = new JLabel("Hours");
		label_9.setBounds(60, 66, 38, 15);
		panel_3.add(label_9);
		
		spinner_7 = new JSpinner();
		spinner_7.setBounds(91, 63, 61, 22);
		panel_3.add(spinner_7);
		
		label_10 = new JLabel("Minutes");
		label_10.setBounds(160, 66, 54, 15);
		panel_3.add(label_10);
		
		spinner_8 = new JSpinner();
		spinner_8.setBounds(204, 63, 62, 22);
		panel_3.add(spinner_8);
		
		label_11 = new JLabel("Seconds");
		label_11.setBounds(273, 66, 54, 15);
		panel_3.add(label_11);
		
		spinner_9 = new JSpinner();
		spinner_9.setBounds(323, 63, 61, 22);
		panel_3.add(spinner_9);
		
		JPanel panel_4 = new JPanel();
		tabbedPane.addTab("RID", null, panel_4, null);
		panel_4.setLayout(null);
		
		label_12 = new JLabel("Start");
		label_12.setBounds(10, 10, 76, 15);
		panel_4.add(label_12);
		
		spinner_10 = new JSpinner();
		spinner_10.setBounds(63, 7, 133, 22);
		panel_4.add(spinner_10);
		
		label_13 = new JLabel("End");
		label_13.setBounds(10, 35, 54, 15);
		panel_4.add(label_13);
		
		spinner_11 = new JSpinner();
		spinner_11.setBounds(63, 32, 133, 22);
		panel_4.add(spinner_11);
		
		label_14 = new JLabel("Repeats");
		label_14.setBounds(0, 65, 54, 15);
		panel_4.add(label_14);
		
		label_15 = new JLabel("Hours");
		label_15.setBounds(48, 65, 38, 15);
		panel_4.add(label_15);
		
		spinner_12 = new JSpinner();
		spinner_12.setBounds(87, 62, 61, 22);
		panel_4.add(spinner_12);
		
		label_16 = new JLabel("Minutes");
		label_16.setBounds(158, 67, 54, 15);
		panel_4.add(label_16);
		
		spinner_13 = new JSpinner();
		spinner_13.setBounds(206, 62, 62, 22);
		panel_4.add(spinner_13);
		
		label_17 = new JLabel("Seconds");
		label_17.setBounds(273, 65, 54, 15);
		panel_4.add(label_17);
		
		spinner_14 = new JSpinner();
		spinner_14.setBounds(325, 62, 61, 22);
		panel_4.add(spinner_14);
		
		JPanel panel_5 = new JPanel();
		tabbedPane.addTab("EC", null, panel_5, null);
		panel_5.setLayout(null);
		
		label_18 = new JLabel("Start");
		label_18.setBounds(10, 10, 76, 15);
		panel_5.add(label_18);
		
		spinner_15 = new JSpinner();
		spinner_15.setBounds(63, 7, 133, 22);
		panel_5.add(spinner_15);
		
		label_19 = new JLabel("End");
		label_19.setBounds(10, 35, 54, 15);
		panel_5.add(label_19);
		
		spinner_16 = new JSpinner();
		spinner_16.setBounds(63, 32, 133, 22);
		panel_5.add(spinner_16);
		
		label_20 = new JLabel("Repeats");
		label_20.setBounds(0, 67, 54, 15);
		panel_5.add(label_20);
		
		label_21 = new JLabel("Hours");
		label_21.setBounds(64, 67, 38, 15);
		panel_5.add(label_21);
		
		spinner_17 = new JSpinner();
		spinner_17.setBounds(95, 67, 61, 22);
		panel_5.add(spinner_17);
		
		label_22 = new JLabel("Minutes");
		label_22.setBounds(166, 67, 54, 15);
		panel_5.add(label_22);
		
		spinner_18 = new JSpinner();
		spinner_18.setBounds(212, 64, 62, 22);
		panel_5.add(spinner_18);
		
		label_23 = new JLabel("Seconds");
		label_23.setBounds(284, 67, 54, 15);
		panel_5.add(label_23);
		
		spinner_19 = new JSpinner();
		spinner_19.setBounds(331, 64, 61, 22);
		panel_5.add(spinner_19);
		
		JPanel panel_6 = new JPanel();
		tabbedPane.addTab("TP", null, panel_6, null);
		panel_6.setLayout(null);
		
		label_24 = new JLabel("Start");
		label_24.setBounds(10, 10, 76, 15);
		panel_6.add(label_24);
		
		spinner_20 = new JSpinner();
		spinner_20.setModel(new SpinnerDateModel(new Date(1522123200000L), null, null, Calendar.MINUTE));
		spinner_20.setBounds(63, 7, 133, 22);
		panel_6.add(spinner_20);
		
		label_25 = new JLabel("End");
		label_25.setBounds(10, 35, 54, 15);
		panel_6.add(label_25);
		
		spinner_21 = new JSpinner();
		spinner_21.setModel(new SpinnerDateModel(new Date(1522123200000L), null, null, Calendar.MINUTE));
		spinner_21.setBounds(63, 32, 133, 22);
		panel_6.add(spinner_21);
		
		label_26 = new JLabel("Repeats");
		label_26.setBounds(0, 66, 54, 15);
		panel_6.add(label_26);
		
		label_27 = new JLabel("Hours");
		label_27.setBounds(48, 66, 38, 15);
		panel_6.add(label_27);
		
		spinner_22 = new JSpinner();
		spinner_22.setBounds(83, 66, 61, 22);
		panel_6.add(spinner_22);
		
		label_28 = new JLabel("Minutes");
		label_28.setBounds(155, 66, 54, 15);
		panel_6.add(label_28);
		
		spinner_23 = new JSpinner();
		spinner_23.setBounds(194, 63, 62, 22);
		panel_6.add(spinner_23);
		
		label_29 = new JLabel("Seconds");
		label_29.setBounds(266, 66, 54, 15);
		panel_6.add(label_29);
		
		spinner_24 = new JSpinner();
		spinner_24.setBounds(330, 63, 61, 22);
		panel_6.add(spinner_24);
		
		JPanel panel_7 = new JPanel();
		tabbedPane.addTab("DO", null, panel_7, null);
		panel_7.setLayout(null);
		
		JLabel label = new JLabel("Start");
		label.setBounds(10, 10, 30, 15);
		panel_7.add(label);
		
		JLabel label_1 = new JLabel("End");
		label_1.setBounds(10, 35, 54, 15);
		panel_7.add(label_1);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(62, 7, 133, 22);
		panel_7.add(spinner);
		
		spinner_1 = new JSpinner();
		spinner_1.setBounds(62, 32, 133, 22);
		panel_7.add(spinner_1);
		
		label_2 = new JLabel("Repeats");
		label_2.setBounds(10, 66, 54, 15);
		panel_7.add(label_2);
		
		label_3 = new JLabel("Hours");
		label_3.setBounds(62, 66, 38, 15);
		panel_7.add(label_3);
		
		spinner_2 = new JSpinner();
		spinner_2.setBounds(105, 63, 61, 22);
		panel_7.add(spinner_2);
		
		label_4 = new JLabel("Minutes");
		label_4.setBounds(176, 66, 54, 15);
		panel_7.add(label_4);
		
		spinner_3 = new JSpinner();
		spinner_3.setBounds(220, 63, 62, 22);
		panel_7.add(spinner_3);
		
		label_5 = new JLabel("Seconds");
		label_5.setBounds(313, 66, 54, 15);
		panel_7.add(label_5);
		
		spinner_4 = new JSpinner();
		spinner_4.setBounds(366, 63, 61, 22);
		panel_7.add(spinner_4);
		
		JLabel lblLog = new JLabel("Log");
		lblLog.setBounds(10, 409, 54, 15);
		contentPane.add(lblLog);
		
		cmbMode = new JComboBox();
		cmbMode.setModel(new DefaultComboBoxModel(new String[] {"Mode 1", "Mode 2"}));
		cmbMode.setSelectedIndex(1);
		cmbMode.setBounds(94, 94, 71, 21);
		contentPane.add(cmbMode);
		
		JLabel lblSelectMode = new JLabel("Select Mode");
		lblSelectMode.setBounds(10, 97, 74, 15);
		contentPane.add(lblSelectMode);
		
		btnConfirm = new JButton("Confirm");
		btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				btnConfirmActionPerformed(evt);
			}
		});
		btnConfirm.setBounds(156, 386, 93, 23);
		contentPane.add(btnConfirm);
		
        btnConnect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConnectActionPerformed(evt);
            }
        });

        btnDisconnect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisconnectActionPerformed(evt);
            }
        });
	}
	
	
    private void btnConnectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConnectActionPerformed
        communicator.connect();
        if (communicator.getConnected() == true)
        {
            if (communicator.initIOStream() == true)
            {
                communicator.initListener();
            }
        }
    }//GEN-LAST:event_btnConnectActionPerformed

    private void btnDisconnectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDisconnectActionPerformed
        communicator.disconnect();
    }
    
    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {
    	communicator.confirmed();
    }
}
