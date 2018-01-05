package com.linbit.linstor.api.protobuf.controller;

import com.linbit.linstor.InternalApiConsts;
import com.linbit.linstor.api.ApiCallRc;
import com.linbit.linstor.api.protobuf.BaseProtoApiCall;
import com.linbit.linstor.api.protobuf.ProtobufApiCall;
import com.linbit.linstor.core.Controller;
import com.linbit.linstor.netcom.Message;
import com.linbit.linstor.netcom.Peer;
import com.linbit.linstor.proto.javainternal.MsgIntDelVlm;
import com.linbit.linstor.security.AccessContext;
import java.io.IOException;
import java.io.InputStream;

/**
 *
 * @author rpeinthor
 */
@ProtobufApiCall
public class NotifyVolumeDeleted extends BaseProtoApiCall {
    private final Controller controller;

    public NotifyVolumeDeleted(Controller controllerRef)
    {
        super(controllerRef.getErrorReporter());
        controller = controllerRef;
    }

    @Override
    public String getName()
    {
        return InternalApiConsts.API_NOTIFY_VLM_DEL;
    }

    @Override
    public String getDescription()
    {
        return "Notify controller that the satellite deleted the volume.";
    }

    @Override
    public void executeImpl(
        AccessContext accCtx,
        Message msg,
        int msgId,
        InputStream msgDataIn,
        Peer client
    )
        throws IOException
    {
        MsgIntDelVlm.MsgDelVlm msgDelVlm = MsgIntDelVlm.MsgDelVlm.parseDelimitedFrom(msgDataIn);
        ApiCallRc apiCallRc = controller.getApiCallHandler().volumeDeleted(
                accCtx,
                client,
                msgDelVlm.getNodeName(),
                msgDelVlm.getRscName(),
                msgDelVlm.getVlmNr());

        super.answerApiCallRc(accCtx, client, msgId, apiCallRc);
    }
}
