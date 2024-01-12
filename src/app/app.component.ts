import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'akash';
 year=0;
 li=['skoda','red','mg'];
 feature=6;
 selectedFeatures:any =[];
 onAdd() {
  this.selectedFeatures.push(this.feature);
}

onRemove(){
  this.selectedFeatures.pop();
}
list1:String[]=[];
    newItem: string = "";

  addToList1(item: string) {
    this.list1.push(item);
    this.newItem = "";
  }
view=true;
view1=true;
show="";
num="";
date=Date();
birthday=new Date(1999,0,29);
}
