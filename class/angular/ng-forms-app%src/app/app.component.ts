import { Component } from '@angular/core';
import { FormGroup, FormControl, Validators} from '@angular/forms'
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'ng-forms-app';
  myForm=new FormGroup({
  firstname: new FormControl('',[
    Validators.required, 
    Validators.maxLength(10),
    Validators.minLength(3)
  ]),
  lastname: new FormControl('',[
    Validators.required, 
    Validators.maxLength(10),
    Validators.minLength(3)
  ]),
  email: new FormControl('',[
    Validators.required,
    Validators.pattern(/^[a-zA-Z0-9._]+@[A-Za-z0-9]+.[A-Za-z]{2,5}$/)
  ]),
  contact: new FormControl('',[
    Validators.required, 
    Validators.minLength(10),
    Validators.pattern(/^[0-9]{10}$/)
  ]),
  gender: new FormControl('',[
    Validators.required
  ]),
  language: new FormControl('',[
    Validators.required
  ]),
  address: new FormGroup({
    city: new FormControl('', [
    Validators.required
    ]),
    state: new FormControl('',[
      Validators.required
    ])
  })
});
error_messages ={
  'firstname':[
    {type:'required', message:"field should not be empty"},
    {type:'maxlength', message:"max length should be 10"},
    {type:'minlength', message:"min length should be 3"},
  ],
  'lastname':[
    {type:'required', message:"field should not be empty"},
    {type:'maxlength', message:"max length should be 10"},
    {type:'minlength', message:"min length should be 10"}
  ],
  'email':[
    {type:'required', message:"field should not be empty"},
    {type:'pattern', message:"invalid email format"}
  ],
  'contact':[
    {type:'required', message:"field should not be empty"},
    {type:'minlength', message:"contact should have 10 digits"},
    {type:'pattern', message:"invalid mobile number"}
  ],
  'gender':[
    {type:'required', message:"select gender"},
  ],
  'language':[
    {type:'required', message:"atleast one should be selected"}
  ],
  'city':[
    {type:'required', message:"city should not be empty"}
  ],
  'state':[
    {type:'required', message:"state should not be empty"}
  ]
}
}
