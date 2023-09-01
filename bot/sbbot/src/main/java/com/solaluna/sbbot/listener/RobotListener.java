package com.solaluna.sbbot.listener;

import net.itbaima.robot.event.RobotListenerHandler;
import net.mamoe.mirai.event.events.MemberJoinRequestEvent;

@net.itbaima.robot.event.RobotListener
public class RobotListener {
    @RobotListenerHandler
    public void handleJoin(MemberJoinRequestEvent memberJoinRequestEvent){
    }
}
