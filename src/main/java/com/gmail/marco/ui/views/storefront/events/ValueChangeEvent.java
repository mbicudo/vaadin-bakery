package com.gmail.marco.ui.views.storefront.events;

import com.vaadin.flow.component.ComponentEvent;
import com.gmail.marco.ui.views.orderedit.OrderItemsEditor;

public class ValueChangeEvent extends ComponentEvent<OrderItemsEditor> {

	public ValueChangeEvent(OrderItemsEditor component) {
		super(component, false);
	}
}