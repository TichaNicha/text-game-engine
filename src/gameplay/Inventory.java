/**
 * Inventory is a class that stores an arraylist of pickups
 * @author Nicha Techatassanasoontorn 21139671
 **/
package gameplay;

import java.util.ArrayList;
import java.util.List;

import pickups.Pickup;

public class Inventory 
{
	
	private ArrayList<Pickup> items;
	//------------------------------------
	public Inventory()
	{
		this.items = new ArrayList<Pickup>();
	}
	//------------------------------------
	public String toString() {
		StringBuilder out = new StringBuilder();

		for (Pickup p : items) {
			if (p != null) {
				out.append(p);
				out.append(", ");
			}
		}

		if (out.length() > 0) {
			// Remove the trailing comma if there are items
			out.deleteCharAt(out.length() - 2);
		} else {
			return"nothing";
		}

		return out.toString();
	}

	//------------------------------------
	public Pickup remove(String id)
	{
		Pickup p = this.select(id);

		this.items.remove(p);			

		return p;
	}
	//------------------------------------
	public Pickup select(String id)
	{
		for(Pickup p : this.items)
		{
			if (p!=null && p.compareID(id))
			{
				return p;
			}
		}
		return null;
	}
	//------------------------------------
	public void add(Pickup p)
	{
		this.items.add(p);
	}
	//------------------------------------
	public void remove(Pickup p)
	{
		this.items.remove(p);
	}
	//------------------------------------
	public Pickup[] getItems()
	{
		Pickup[] items = new Pickup[this.items.size()];
		for(int i=0;i<items.length;i++)
		{
			items[i] = this.items.get(i);
		}
		return items;
	}

	public void clear() {
		this.items.clear();
	}

	public void addAll(List<Pickup> contents) {
		this.items.addAll(contents);
	}

	public boolean isEmpty() {
		return this.items.isEmpty();
	}
}
