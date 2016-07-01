import { Component } from '@angular/core';

@Component({
    selector: 'my-app',
    template: '<h1>Tour of heroes</h1>'
})
export class AppComponent{
    selectedHero: Hero;

}

export class Hero {
    id: number;
    name: string;
}