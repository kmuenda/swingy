package view.gui;
import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.awt.event.ActionEvent;


public class SelectHero
{
    public void CreateHeros()
    {
        final JFrame f = new JFrame("Swingy");
        f.setSize(400, 400);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel(new GridBagLayout());
        f.add(panel);
        f.getContentPane().add(panel, BorderLayout.WEST);
        GridBagConstraints c = new GridBagConstraints();
        
        final JButton b = new JButton("Create a new hero");
        c.gridx = 0;
        c.gridy = 0;
        c.insets = new Insets(50, 40, 40, 40);
        panel.add(b, c);
        b.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if (e.getSource() == b)
                f.dispose();
            {

                final JFrame fr = new JFrame("Swingy");
                fr.setSize(400, 400);
                fr.setVisible(true);
                fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                JPanel panel = new JPanel(new GridBagLayout());
                fr.add(panel);
                fr.getContentPane().add(panel, BorderLayout.WEST);
                GridBagConstraints cc = new GridBagConstraints();
                cc.gridx = 0;
                cc.gridy = 0;
                panel.add(new JLabel("Enter hero name"), cc);
                cc.gridx = 1;
                cc.gridy = 0;
                final JTextField text = new JTextField(10);
                panel.add(text, cc);
                panel.revalidate();
                panel.repaint();

                JButton add = new JButton("Add hero");
                cc.gridx = 0;
                cc.gridy = 2;
                panel.add(add, cc);
                cc.gridx = 0;
                cc.gridy = 1;
                panel.add(new JLabel("Select hero type"), cc);
               final DefaultListModel<String> la1 = new DefaultListModel<>();
                la1.addElement("Knight      ");
                la1.addElement("Warrior     ");
                la1.addElement("Black magic    ");
                la1.addElement("Thief          ");
                cc.gridx = 1;
                cc.gridy = 1;
                panel.add(new JList<>(la1), cc);

                final JButton but = new JButton("Start Game");
                cc.gridx = 0;
                cc.gridy = 3;
                cc.insets = new Insets(50, 40, 40, 40);
                panel.add(but, cc);
        
                JButton but1 = new JButton("Cancel");
                cc.gridx = 1;
                cc.gridy = 3;
                panel.add(but1, cc);
                f.dispose();
                add.addActionListener(new ActionListener(){
                
                    @Override
                    public void actionPerformed(ActionEvent e) 
                    {
                       PrintWriter fw = null;
                        try
                        {
                            fw = new PrintWriter("Hero.txt", "UTF-8");
                            BufferedWriter bw = new BufferedWriter(fw);
                            bw.write(text.getText());
                            bw.write(la1.getElementAt(1));
                            JOptionPane.showMessageDialog(null, "Successfuly added to file");
                            bw.close();
                        }
                        catch(IOException e1)
                        {
                            e1.printStackTrace();
                        }
                        finally
                        {
                            fw.close();
                        }
                    }
                });                

                but1.addActionListener(new ActionListener(){
                
                    @Override
                    public void actionPerformed(ActionEvent e) 
                    {
                        System.exit(0);
                    }
                });

                but.addActionListener(new ActionListener(){
                
                    @Override
                    public void actionPerformed(ActionEvent e) 
                    {
                        if (e.getSource() == but)
                        {
                            fr.dispose();
                        }
                        JFrame fra = new JFrame("Swingy");
                        fra.setSize(400, 400);
                        fra.setVisible(true);
                        fra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        JPanel panel = new JPanel(new GridBagLayout());
                        fra.add(panel);
                        fra.getContentPane().add(panel, BorderLayout.WEST);
                        GridBagConstraints cc = new GridBagConstraints();
                        JButton b1 = new JButton("Move up");
                        JButton b2 = new JButton("Move down");
                        JButton b3 = new JButton("Move left");
                        JButton b4 = new JButton("Move right");
                        JButton can = new JButton("Exit Game");
                        JButton b5 = new JButton("Fight");
                        JButton b6 = new JButton("Run");
                        final JTextArea tf = new JTextArea();
                        tf.setBounds(50, 50, 200, 50);
                        cc.gridx = 0;
                        cc.gridy = 0;
                        panel.add(b1, cc);
                        fra.add(tf);

                        cc.gridx = 0;
                        cc.gridy = 1;
                        panel.add(b2, cc);

                        cc.gridx = 0;
                        cc.gridy = 2;
                        panel.add(b3, cc);

                        cc.gridx = 0;
                        cc.gridy = 3;
                        panel.add(b4, cc);

                        cc.gridx = 3;
                        cc.gridy = 3;
                        panel.add(can, cc);

                        cc.gridx = 3;
                        cc.gridy = 4;
                        panel.add(b5, cc);

                        cc.gridx = 3;
                        cc.gridy = 5;
                        panel.add(b6, cc);
                        b1.addActionListener(new ActionListener(){
                        
                            @Override
                            public void actionPerformed(ActionEvent e) 
                            {
                                tf.append("You've moved up\n");
                            }
                        });
                        b2.addActionListener(new ActionListener(){
                        
                            @Override
                            public void actionPerformed(ActionEvent e) 
                            {
                               tf.append("You've move down\n"); 
                            }
        
                        });
                        b2.addActionListener(new ActionListener(){
                        
                            @Override
                            public void actionPerformed(ActionEvent e) 
                            {
                                tf.append("Monster...run or fight?\n");    
                            }
                        });
                        b3.addActionListener(new ActionListener(){
                        
                            @Override
                            public void actionPerformed(ActionEvent e) 
                            {
                                tf.append("You've moved to the left\n");  
                            }
                        });
                        b4.addActionListener(new ActionListener(){
                                
                                    @Override
                                    public void actionPerformed(ActionEvent e) 
                                    {
                                        
                                        tf.append("Monster...run or fight?\n");
                                    }
                                });
                        can.addActionListener(new ActionListener(){
                        
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                System.exit(0);
                            }
                        });
                        b5.addActionListener(new ActionListener(){
                        
                            @Override
                            public void actionPerformed(ActionEvent e) 
                            {
                                tf.append("You've won\n");
                            }
                        });
                        b6.addActionListener(new ActionListener(){
                        
                            @Override
                            public void actionPerformed(ActionEvent e) 
                            {
                                tf.append("You are a coward!!!\n");
                            }
                        });

                            }
                        });

                    }
                }
                });


       final JButton b1 = new JButton("Select existing hero");
        c.gridx = 0;
        c.gridy = 1;
        c.insets = new Insets(50, 40, 40, 40);
        panel.add(b1, c);

        b1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
               if (e.getSource() == b1)
               {
                   f.dispose();
               }
               final JFrame frame = new JFrame("Swingy");
                frame.setSize(400, 400);
                frame.setVisible(true);
                f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                JPanel panel = new JPanel(new GridBagLayout());
                frame.add(panel);
                frame.getContentPane().add(panel, BorderLayout.WEST);
                GridBagConstraints cc = new GridBagConstraints();
                panel.add(new JLabel("Select hero type"), cc);

                DefaultListModel<String> la1 = new DefaultListModel<>();
                la1.addElement("Dee Knight  1, 1, Glass armor");
                la1.addElement("Hello Knight 1, 2, leather armor");
                la1.addElement("Gwe Black magic 1, 1, Armor");
                la1.addElement("Pat Warrior, 1, 1, Animal skin");
                la1.addElement("Liberty Black magic, 1, 1, leather");
                cc.gridx = 1;
                cc.gridy = 1;
                panel.add(new JList<>(la1), cc);

                final JButton but = new JButton("Start Game");
                cc.gridx = 0;
                cc.gridy = 2;
                cc.insets = new Insets(50, 40, 40, 40);
                panel.add(but, cc);

                JButton add = new JButton("Add hero");
                cc.gridx = 0;
                cc.gridy = 1;
                panel.add(add, cc);

                JButton canc = new JButton("Cancel");
                cc.gridx = 1;
                cc.gridy = 2;
                panel.add(canc, cc);

                add.addActionListener(new ActionListener(){
                
                    @Override
                    public void actionPerformed(ActionEvent e) 
                    {
                        JOptionPane.showMessageDialog(null, "Successfuly added to file");
                    }
                });
                

                canc.addActionListener(new ActionListener(){
                
                    @Override
                    public void actionPerformed(ActionEvent e) 
                    {
                        System.exit(0);
                    }
                });
                but.addActionListener(new ActionListener()
                {
                
                    @Override
                    public void actionPerformed(ActionEvent e) 
                    {
                        if (e.getSource() == but)
                        {
                            frame.dispose();
                        }
                        JFrame f = new JFrame("Swingy");
                        f.setSize(400, 400);
                        f.setVisible(true);
                        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        JPanel panel = new JPanel(new GridBagLayout());
                        f.add(panel);
                        f.getContentPane().add(panel, BorderLayout.WEST);
                        GridBagConstraints cc = new GridBagConstraints();
                        JButton b1 = new JButton("Move up");
                        JButton b2 = new JButton("Move down");
                        JButton b3 = new JButton("Move left");
                        JButton b4 = new JButton("Move right");
                        JButton b5 = new JButton("Fight");
                        JButton b6 = new JButton("Run");
                        JButton can = new JButton("ExitGame");
                        cc.gridx = 1;
                        cc.gridy = 4;
                        panel.add(can, cc);
                        final JTextArea tf = new JTextArea();
                        tf.setBounds(50, 50, 200, 50);
                        cc.gridx = 0;
                        cc.gridy = 0;
                        panel.add(b1, cc);
                        f.add(tf);
                        cc.gridx = 0;
                        cc.gridy = 1;
                        panel.add(b1, cc);

                        cc.gridx = 0;
                        cc.gridy = 2;
                        panel.add(b2, cc);

                        cc.gridx = 0;
                        cc.gridy = 3;
                        panel.add(b3, cc);

                        cc.gridx = 0;
                        cc.gridy = 4;
                        panel.add(b4, cc);

                        cc.gridx = 1;
                        cc.gridy = 2;
                        panel.add(b5, cc);

                        cc.gridx = 1;
                        cc.gridy = 3;
                        panel.add(b6, cc);

                        can.addActionListener(new ActionListener(){
                
                            @Override
                            public void actionPerformed(ActionEvent e) 
                            {
                                System.exit(0);
                            }
                        });


                        b1.addActionListener(new ActionListener(){
                        
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                tf.append("You've moved up\n");
                            }
                        });
                        b2.addActionListener(new ActionListener(){
                        
                            @Override
                            public void actionPerformed(ActionEvent e) 
                            {
                                tf.append("You've moved down\n");
                                tf.append("Monster...run or fight?\n");
                            }
                        });
                        b3.addActionListener(new ActionListener(){
                        
                            @Override
                            public void actionPerformed(ActionEvent e) 
                            {
                                tf.append("You've moved to the left\n");
                            }
                        });
                        b4.addActionListener(new ActionListener(){
                        
                            @Override
                            public void actionPerformed(ActionEvent e) 
                            {
                                tf.append("You've moved to the right\n");
                                tf.append("Monster...run or fight?\n");  
                            }
                        });
                        b5.addActionListener(new ActionListener(){
                        
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                tf.append("You've won\n");
                            }
                        });
                        b6.addActionListener(new ActionListener(){
                        
                            @Override
                            public void actionPerformed(ActionEvent e) 
                            {
                                tf.append("You are a coward!!!\n");
                            }
                        });
                  }
                });
              
            }
        });
    }

}