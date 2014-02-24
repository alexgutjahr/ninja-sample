package controllers;

import com.google.inject.Singleton;
import ninja.Result;
import ninja.Results;

/**
 * @author <a href="mailto:alexander.hanschke@techdev.de">Alexander Hanschke</a>
 */
@Singleton
public class TaskController extends BaseController {

    public Result all() {
        return Results.ok();
    }

    public Result show() {
        return Results.ok();
    }
}
