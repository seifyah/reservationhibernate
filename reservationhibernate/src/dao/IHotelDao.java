package dao;

import java.util.List;

import entities.Client;
import entities.Hotel;

public interface IHotelDao {
	public void add (Hotel c);
	public List<Hotel>findAll();
	public void delete(Hotel c);
	public void update(Hotel c);

}
