package com.github.atomicblom.chiselsheep.networking;

import io.netty.buffer.ByteBuf;
import net.minecraft.entity.Entity;
import net.minecraftforge.fml.common.network.ByteBufUtils;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;

public class CheckSheepChiseledRequestMessage implements IMessage
{
    private String sheepUUID;

    @SuppressWarnings("unused")
    public CheckSheepChiseledRequestMessage() {}

    public CheckSheepChiseledRequestMessage(Entity sheep)
    {
        sheepUUID = sheep.getCachedUniqueIdString();
    }

    @Override
    public void fromBytes(ByteBuf buf)
    {
        sheepUUID = ByteBufUtils.readUTF8String(buf);

    }

    @Override
    public void toBytes(ByteBuf buf)
    {
        ByteBufUtils.writeUTF8String(buf, sheepUUID);
    }

    public String getSheepUUID()
    {
        return sheepUUID;
    }
}