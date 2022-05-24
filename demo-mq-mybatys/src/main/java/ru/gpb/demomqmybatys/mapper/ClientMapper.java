package ru.gpb.demomqmybatys.mapper;

import org.apache.ibatis.annotations.Mapper;
import ru.gpb.demomqmybatys.model.Client;

@Mapper
public interface ClientMapper {

  Client findById(int id);

  void insertClient(Client client);

}
