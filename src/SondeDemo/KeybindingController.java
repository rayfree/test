/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package SondeDemo;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.KeyStroke;

public class KeybindingController {
    GUI window = null;

    private int leftThrottle = 0;
    private int rightThrottle = 0;

    private static final int SPEED_INCREMENT = 5;

    private static char leftAccel = 'q';
    private static char leftDecel = 'a';
    private static char rightAccel = 'e';
    private static char rightDecel = 'd';
    private static char bothAccel = 'w';
    private static char bothDecel = 's';

    public KeybindingController(GUI window)
    {
        this.window = window;
    }

    public void bindKeys()
    {
        //set input maps so that the program can read key bindings
        //putting something in the input map means to assign a key to an action name
        //action name is associated with a method in the action map

    }

    public void toggleControls()
    {
        if (window.communicator.getConnected() == true)
        {
            

            window.btnDisconnect.setEnabled(true);
            window.btnConnect.setEnabled(false);
            window.cboxPorts.setEnabled(false);
        }
        else
        {
            

            window.btnDisconnect.setEnabled(false);
            window.btnConnect.setEnabled(true);
            window.cboxPorts.setEnabled(true);
        }
    }

    //defining the action
    Action accelerateLeft = new AbstractAction()
    {
        public void actionPerformed(ActionEvent evt)
        {
            leftThrottle = accelerate(leftThrottle);
            updateLabels();
        }
    };

    Action decelerateLeft = new AbstractAction()
    {
        public void actionPerformed(ActionEvent evt)
        {
            leftThrottle = decelerate(leftThrottle);
            updateLabels();
        }
    };

    Action accelerateRight = new AbstractAction()
    {
        public void actionPerformed(ActionEvent evt)
        {
            rightThrottle = accelerate(rightThrottle);
            updateLabels();
        }
    };

    Action decelerateRight = new AbstractAction()
    {
        public void actionPerformed(ActionEvent evt)
        {
            rightThrottle = decelerate(rightThrottle);
            updateLabels();
        }
    };

    Action accelerateBoth = new AbstractAction()
    {
        public void actionPerformed(ActionEvent evt)
        {
            leftThrottle = accelerate(leftThrottle);
            rightThrottle = accelerate(rightThrottle);
            updateLabels();
        }
    };

    Action decelerateBoth = new AbstractAction()
    {
        public void actionPerformed(ActionEvent evt)
        {
            leftThrottle = decelerate(leftThrottle);
            rightThrottle = decelerate(rightThrottle);
            updateLabels();
        }
    };

    public void updateLabels()
    {
       
        window.communicator.writeData(leftThrottle, rightThrottle);
    }

    public int accelerate(int throttle)
    {
        if (throttle < 100)
        {
            throttle += SPEED_INCREMENT;
        }
        return throttle;
    }

    public int decelerate(int throttle)
    {
        if (throttle > 0)
        {
            throttle -= SPEED_INCREMENT;
        }
        return throttle;
    }

    final public int getLeftThrottle()
    {
        return leftThrottle;
    }

    public void setLeftThrottle(int value)
    {
        leftThrottle = value;
    }

    final public int getRightThrottle()
    {
        return rightThrottle;
    }

    public void setRightThrottle(int value)
    {
        rightThrottle = value;
    }
}
