import { Component } from '@angular/core';

@Component({
  selector: 'app-table',
  templateUrl: './table.component.html',
  styleUrls: ['./table.component.css']
})
export class TableComponent {
  movie=[{name:"singam",director:"siva",hero:"suriya"},
  {name:"Mark antony",director:"akash",hero:"vishal"},
  {name:"Good night",director:"vignesh",hero:"akash"}]
}
