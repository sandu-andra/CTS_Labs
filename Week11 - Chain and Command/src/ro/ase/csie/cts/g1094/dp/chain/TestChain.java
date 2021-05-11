package ro.ase.csie.cts.g1094.dp.chain;

public class TestChain {

	public static void main(String[] args) {
	
		ChatHandler languageFilter = new LanguageFilter("English");
		ChatHandler privateChat = new PrivateChat();
		ChatHandler globalChat = new GlobalChat();
		
		languageFilter.setNext(privateChat);  //step 1 for message
		privateChat.setNext(globalChat);    //step 2 for message
		
		ChatHandler chatServer = languageFilter;
		
		chatServer.processMessage(new Message("@everyone","Kill superman. It's a bot",10));
		chatServer.processMessage(new Message("@John","Let's start level 2",0));
		chatServer.processMessage(new Message("@everyone","Let's join the party",0));
	}

}
