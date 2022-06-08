package com.co.apisoap.callingservicessoap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.tempuri.Request;
import org.tempuri.Response;

@RestController
@RequestMapping("comunity")
public class rest
{
    @Value("${WSDL.SOAPClient}")
    private String clientEndPoint;
   @Autowired
    public SOAPConnectClient cliete;

   private Jaxb2Marshaller marshaller;

    @GetMapping
    @RequestMapping("{id}")
    public String comunidad (@PathVariable String id){
        Request request = new Request();

        request.setId(id);
        Response response = (Response) cliete.callWebServices(clientEndPoint,request);
        System.out.println(response.getResult() + "asadsasd");
        return response.getResult().toString();
    }
}
