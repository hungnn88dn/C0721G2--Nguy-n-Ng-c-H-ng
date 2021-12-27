import {Component, OnInit} from '@angular/core';
import {ActivatedRoute, Router} from '@angular/router';
import {EmployeeService} from '../../service/employee.service';
import {Employee} from '../../model/employee';
import {Observable} from 'rxjs';

@Component({
  selector: 'app-employee-delete',
  templateUrl: './employee-delete.component.html',
  styleUrls: ['./employee-delete.component.css']
})
export class EmployeeDeleteComponent implements OnInit {
  deleteEmployee: Observable<any>;
  employee: Employee;

  constructor(private activatedRoute: ActivatedRoute, private employeeSerivce: EmployeeService, private router: Router) {
  }

  ngOnInit(): void {
    let indexDelete = this.activatedRoute.snapshot.params['id'];
    this.deleteEmployee = this.employeeSerivce.findEmployeeById(indexDelete);
    this.deleteEmployee.subscribe(data => {
      this.employee = data;
    });
  }

  submit() {
    let indexDelete = this.activatedRoute.snapshot.params['id'];
    this.employeeSerivce.deleteEmployeeById(indexDelete).subscribe(data => {
      console.log(data);
      this.router.navigateByUrl('employee/list');
      alert('Xoa Thanh Cong');
    });

  }
}
