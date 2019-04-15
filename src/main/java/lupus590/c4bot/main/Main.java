package lupus590.c4bot.main;
import java.io.File;

import listeners.MessageListener;
import net.clgd.ccemux.init.Launcher;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.JDABuilder;

public class Main {
    public static void main(String[] args) throws Exception
    {
    	Launcher.main(new String[] {});
    	
    	String token = null;
        if(args.length == 0) {
			File f = new File("./config.xml");
			if (f.isFile()) {
				//Some code
			}
			if (token == null) {
	            System.out.println("Please run again passing in a bot token");
	            return;
			}
        } else {
        	token = args[0];
        }

        System.out.println("Using Discord bot token: "+token);
        JDA jda = new JDABuilder(args[0]).build();
        jda.addEventListener(new MessageListener());
    }
}
