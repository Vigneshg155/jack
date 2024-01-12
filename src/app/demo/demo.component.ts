import { Component } from '@angular/core';

@Component({
  selector: 'demo-component',
  templateUrl: './demo.component.html',
  styleUrls: ['./demo.component.css']
})
export class DemoComponent {
  l=[{name:"Benz",color:"blue",price:2700000},{
    name:"MG",color:"red",price:25000000 
  }]
}
