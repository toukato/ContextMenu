package burp;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JMenuItem;

public class BurpExtender implements IBurpExtender, IContextMenuFactory
{
    public void registerExtenderCallbacks(IBurpExtenderCallbacks callbacks)
    {
        // your extension code here
    	callbacks.registerContextMenuFactory(this);
    }
    
    public List<JMenuItem> createMenuItems(IContextMenuInvocation invocation)
    {
    	List<JMenuItem> menuList = new ArrayList<JMenuItem>();
    	JMenuItem menuItem = new JMenuItem("test");
    	menuItem.addActionListener(new ActionListener()
    	{
    		public void actionPerformed(ActionEvent e)
    		{
    			
    		}

    	});
    	menuList.add(menuItem);
    	return menuList;
    }
}