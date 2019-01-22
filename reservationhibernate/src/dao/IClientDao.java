package dao;

import java.util.List;

import entities.Client;

public interface IClientDao {
	public void add (Client c);
	public List<Client>findAll();
	public void delete(Client c);
	public void update(Client c);

}
