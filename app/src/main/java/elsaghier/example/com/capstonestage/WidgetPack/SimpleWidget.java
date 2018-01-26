package elsaghier.example.com.capstonestage.WidgetPack;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.widget.RemoteViews;

import elsaghier.example.com.capstonestage.R;

/**
 * Implementation of App Widget functionality.
 */
public class SimpleWidget extends AppWidgetProvider {
    static String HOTEL_NAME = "Arafa";
    static String RESTAURANT_NAME = "Apples's";

    static void updateAppWidget(Context context, AppWidgetManager appWidgetManager,
                                int appWidgetId) {

        CharSequence widgetText = context.getString(R.string.appwidget_text);
        // Construct the RemoteViews object
        RemoteViews views = new RemoteViews(context.getPackageName(), R.layout.simple_widget);
        views.setTextViewText(R.id.appwidget_restaurant, RESTAURANT_NAME);
        views.setTextViewText(R.id.appwidget_hotelName, HOTEL_NAME);

        // Instruct the widget manager to update the widget
        appWidgetManager.updateAppWidget(appWidgetId, views);
    }

    @Override
    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] appWidgetIds) {
        // There may be multiple widgets active, so update all of them
        for (int appWidgetId : appWidgetIds) {
            updateAppWidget(context, appWidgetManager, appWidgetId);
        }
    }

    @Override
    public void onEnabled(Context context) {
        // Enter relevant functionality for when the first widget is created
    }

    @Override
    public void onDisabled(Context context) {
        // Enter relevant functionality for when the last widget is disabled
    }
}

