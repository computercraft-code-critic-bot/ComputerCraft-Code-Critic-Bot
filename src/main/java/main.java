import net.dv8tion.jda.client.entities.Group;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.JDABuilder;
import net.dv8tion.jda.core.Permission;
import net.dv8tion.jda.core.entities.*;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import net.dv8tion.jda.core.exceptions.PermissionException;
import net.dv8tion.jda.core.exceptions.RateLimitedException;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class main {
    public static void main(String[] args) throws Exception
    {
        if(args[0].isEmpty()) {
            System.out.println("Please run again passing in a bot token");
            return;
        }

        System.out.println("Using Discord bot token: "+args[0]);
        JDA jda = new JDABuilder(args[0]).build();
        jda.addEventListener(new MessageListener());
    }
}
