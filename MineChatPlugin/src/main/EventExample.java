package main;

import de.minetrain.minechat.config.obj.MacroObject;
import de.minetrain.minechat.gui.obj.messages.MessageComponentContent;
import de.minetrain.minechat.twitch.obj.TwitchMessage;
import de.minetrain.minechat.utils.ChatMessage;
import de.minetrain.minechat.utils.events.MineChatEvents;

//public class EventExample extends EventListener{
public class EventExample implements MineChatEvents{

	@Override
	public void onIncomingMessageEvent(TwitchMessage message) {
		System.err.println("Plugin - "+message.getMessage());
	}

	@Override
	public void onMessageHighliteEvent(MessageComponentContent content) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onSentMessageEvent(ChatMessage message) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onExecuteMacroEvent(MacroObject macro) {
		// TODO Auto-generated method stub
		
	}

}
