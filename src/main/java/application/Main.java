package application;

import application.domain.command.CommandManager;
import application.model.Bulldozer;
import application.model.Sitemap;

public class Main {


        public static void main(String[] args) {
            CommandManager commandManager = new CommandManager();

            Sitemap sitemap = Sitemap.getRef();
            Bulldozer bulldozer = Bulldozer.getRef();


            System.out.println(commandManager.getCommandList());
            System.out.println(sitemap.getTile(0,2).getContent());
            System.out.println(bulldozer.getPosition());
            commandManager.findCommand("advance").execute(2);
            System.out.println(bulldozer.getPosition());
            System.out.println(bulldozer.getFuelUsed());

        }

}
