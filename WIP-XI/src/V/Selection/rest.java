/*
 * Copyright (C) 2019 wipcamp11.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301  USA
 */
package V.Selection;

import java.util.Scanner;

/**
 *
 * @author wipcamp11
 */
public class rest {
    public static void main(String[] args) {
        Scanner rest = new Scanner(System.in);
        double foodPrice = rest.nextDouble();
        boolean card = false;
        boolean cash = true;
        if(card){
            foodPrice = foodPrice*95/100; 
            System.out.println("มีบัตรจ้าา");
        }
        if(cash){
            foodPrice = foodPrice*90/100; 
            System.out.println("มีเงิดสดจ้าา");
        }
            System.out.println(foodPrice);
    }
}
