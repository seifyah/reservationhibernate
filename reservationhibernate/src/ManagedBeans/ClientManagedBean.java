package ManagedBeans;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.event.ActionEvent;

import dao.ClientDaoImpl;
import dao.IClientDao;
import entities.Client;

@ManagedBean
public class ClientManagedBean {
	Client c= new Client();
	List<Client> listclt;
	IClientDao dao=new ClientDaoImpl();
	Client selectedclient=new Client();
	
	public Client getSelectedclient() {
		return selectedclient;
	}

	public void setSelectedclient(Client selectedclient) {
		this.selectedclient = selectedclient;
	}

	public Client getC() {
		return c;
	}

	public List<Client> getListclt() {
		listclt=dao.findAll();
		return listclt;
	}

	public void setListclt(List<Client> listclt) {
		this.listclt = listclt;
	}

	public void setC(Client c) {
		this.c = c;
	}
	public void ajouter(ActionEvent e){
		dao.add(c);
	}
	public void supprimer(){
		dao.delete(selectedclient);
	}
	public void modifier(){
		dao.update(selectedclient);
	}
	
	public String editer(){
		return "modif.xhtml";
		
	}

}
