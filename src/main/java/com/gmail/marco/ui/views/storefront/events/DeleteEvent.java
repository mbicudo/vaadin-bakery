package com.gmail.marco.ui.views.storefront.events;

import com.vaadin.flow.component.ComponentEvent;
import com.gmail.marco.ui.views.orderedit.OrderItemEditor;

public class DeleteEvent extends ComponentEvent<OrderItemEditor> {
	public DeleteEvent(OrderItemEditor component) {
		super(component, false);
	}
}