package view;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class VentanaPizzeria extends JFrame{
    private JRadioButton rbMediana, rbGrande, rbClasica, rbBordeQueso;
    private JRadioButton rbNormal, rbPicante, rbOriental;
    private JCheckBox chkJamon, chkPeperoni, chkChile, chkPinia;
    private JPanel panelBase, panelSalsa, panelToppings;

    public VentanaPizzeria(){
        setTitle("Jack Pizza Chef");
        setSize(600, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(1, 3));
        
    
        JPanel panelBase = new JPanel(new GridLayout(0, 1));
        panelBase.setBorder(BorderFactory.createTitledBorder("Base"));
        rbMediana = new JRadioButton("Mediana");
        rbGrande = new JRadioButton("Grande");
        rbClasica = new JRadioButton("Clásica");
        rbBordeQueso = new JRadioButton("Borde de queso");
        rbClasica.setSelected(true);
                
        ButtonGroup grupoBase = new ButtonGroup();
        grupoBase.add(rbMediana);
        grupoBase.add(rbGrande);
        grupoBase.add(rbClasica);
        grupoBase.add(rbBordeQueso);

        panelBase.add(rbMediana);
        panelBase.add(rbGrande);
        panelBase.add(rbClasica);
        panelBase.add(rbBordeQueso);


        JPanel panelSalsa = new JPanel(new GridLayout(0, 1));
        panelSalsa.setBorder(BorderFactory.createTitledBorder("Salsa"));
        rbNormal = new JRadioButton("Normal");
        rbPicante = new JRadioButton("Picante");
        rbOriental = new JRadioButton("Oriental");

        ButtonGroup grupoSalsa = new ButtonGroup();
        grupoSalsa.add(rbNormal);
        grupoSalsa.add(rbPicante);
        grupoSalsa.add(rbOriental);
        
        panelSalsa.add(rbNormal);
        panelSalsa.add(rbPicante);
        panelSalsa.add(rbOriental);



        JPanel panelToppings = new JPanel(new GridLayout(0, 1));
        panelToppings.setBorder(BorderFactory.createTitledBorder("Ingredientes"));
        chkJamon = new JCheckBox("Jamón");
        chkPeperoni = new JCheckBox("Peperoni");
        chkChile = new JCheckBox("Chile pimiento");
        chkPinia = new JCheckBox("Piña");

        panelToppings.add(chkJamon);
        panelToppings.add(chkPeperoni);
        panelToppings.add(chkChile);
        panelToppings.add(chkPinia);

        add(panelBase);
        add(panelSalsa);
        add(panelToppings);

        

    }
}
