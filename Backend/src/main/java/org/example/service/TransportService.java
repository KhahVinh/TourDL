package org.example.service;

import org.example.dto.TransportDTO;
import org.example.modal.Transport;
import org.example.reponsitory.TransportReponsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class TransportService {
    @Autowired
    private TransportReponsitory transportReponsitory;

    public List<Transport> listAllTransports() {
        return transportReponsitory.findAll();
    }

    public Map<Integer, Transport> mapTransports() {
        List<Transport> transports = transportReponsitory.findAll();
        return transports.stream().collect(Collectors.toMap(Transport::getId, transport -> transport));
    }
    public List<TransportDTO> listTransportsUsedInMonth(){
        return transportReponsitory.countByTransportIdForMonth();
    }
}
