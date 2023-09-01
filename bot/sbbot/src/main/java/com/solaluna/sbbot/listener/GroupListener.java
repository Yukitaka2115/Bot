package com.solaluna.sbbot.listener;

import net.itbaima.robot.event.RobotListener;
import net.itbaima.robot.event.RobotListenerHandler;
import net.itbaima.robot.listener.MessageListener;
import net.mamoe.mirai.contact.Group;
import net.mamoe.mirai.contact.Member;
import net.mamoe.mirai.event.events.GroupMessageEvent;

@RobotListener
public class GroupListener extends MessageListener {
    /**
     * 关键词检测
     * @param event
     */
    @RobotListenerHandler(contactId = {849716329})
    public void handleMessage(GroupMessageEvent event){
        String message = event.getMessage().contentToString();
        if (message.contains("nmsl")) {
            Member sender = event.getSender();
            sender.mute(60);
        }
    }

    /**
     * 响应
     * @param event
     */
    @RobotListenerHandler(contactId = {849716329})
    public void ResponseHandler(GroupMessageEvent event){
        String content = event.getMessage().contentToString();
        if(content.contains("紫毛在？")){
            Group group = event.getGroup();
            Member sender = event.getSender();
            System.out.println(group);
            System.out.println(sender);
            group.sendMessage("叫你爹干嘛？");
        }
    }
//没写完，消息解析有问题，目前卡进度
    @RobotListenerHandler(contactId = {849716329})
    public void MuteHandler(GroupMessageEvent event,Member muteMember,Integer muteTime){
        String message = event.getMessage().contentToString();
        if(message.contains("烟"+" "+"@"+muteMember+" "+muteTime)){
            String[] parts = message.split(" ");
            if(parts.length>=3){
                String member = parts[1];
                String time = parts[2];

                if(muteMember.equals(member)&&muteTime.equals(time)){
                    muteMember.mute(muteTime);
                    System.out.println(muteMember);
                }
            }
        }
    }
}
